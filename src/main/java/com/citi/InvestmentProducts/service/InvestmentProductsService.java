package com.citi.InvestmentProducts.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.citi.InvestmentProducts.InvestmentProductsApplication;
import com.citi.InvestmentProducts.dto.ObjectResponseDotNetDto;
import com.citi.InvestmentProducts.dto.UserTokenDotNetDto;
import com.citi.InvestmentProducts.form.UserDotNetForm;

@Service
public class InvestmentProductsService {
	
	private UserTokenDotNetDto userTokenDotNetDto;

	@Value("${url.endpoint.dotnet}")
	private String urlEndpointDotnet;

	@Value("${dotnet.username}")
	private String username;

	@Value("${dotnet.chvDotnetAPI}")
	private String password;
	
	private static final Logger logger = LogManager.getLogger(InvestmentProductsApplication.class);
	
	public InvestmentProductsService login() {
		logger.info("Trying to consume the .net api 'login'...");

		RestTemplate restTempalte = new RestTemplate();
		String url = urlEndpointDotnet + "/api/v1/InvestmentProductsConsult/login";

		ResponseEntity<UserTokenDotNetDto> response = restTempalte.postForEntity(url,
				new UserDotNetForm(username, password), UserTokenDotNetDto.class);

		userTokenDotNetDto = response.getBody();

		return this;
	}

	public ObjectResponseDotNetDto consult() {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.set("Authorization", "Bearer " + userTokenDotNetDto.getToken());
		String url = urlEndpointDotnet + "/api/v1/InvestmentProductsConsult";
		
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url);
		
		HttpEntity<ObjectResponseDotNetDto> entity = new HttpEntity<>(headers);
		
		logger.info("Trying to consume the .net api '" + builder.toUriString() + "'...");
		
		HttpEntity<ObjectResponseDotNetDto> response = restTemplate.exchange(
			builder.toUriString(), 
			HttpMethod.GET, 
			entity, 
			ObjectResponseDotNetDto.class
		);

		return response.getBody();
	}

}
