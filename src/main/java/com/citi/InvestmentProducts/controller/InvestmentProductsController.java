package com.citi.InvestmentProducts.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.citi.InvestmentProducts.InvestmentProductsApplication;
import com.citi.InvestmentProducts.dto.ObjectResponseDotNetDto;
import com.citi.InvestmentProducts.dto.OpenBankingLinkDto;
import com.citi.InvestmentProducts.dto.OpenBankingMetaDto;
import com.citi.InvestmentProducts.dto.OpenBankingSucessDto;
import com.citi.InvestmentProducts.exception.RecordNotFoundException;
import com.citi.InvestmentProducts.service.InvestmentProductsService;

@RestController
@RequestMapping("/open-banking/investment-products")
public class InvestmentProductsController {
	
	@Autowired
	private InvestmentProductsService investmentProductsService;
	
	private static final Logger logger = LogManager.getLogger(InvestmentProductsApplication.class);
	
	@ResponseBody
	@GetMapping(path = "/v1/investment-products-consult", produces = { "application/json" })
	public ResponseEntity<OpenBankingSucessDto> find(HttpServletRequest request) {
		logger.info("Accessing the endpoint '/v1/investment-products-consult");

		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.set("x-v", "1");
		responseHeaders.set("Content-Type", "application/json");

		ObjectResponseDotNetDto objectResponseDotNetDto = investmentProductsService.login().consult();

		OpenBankingSucessDto openBankingSucessDto = objectResponseDotNetDto.converterOpenBankingSucessDto(
			new OpenBankingLinkDto(request.getRequestURL().toString()),
			new OpenBankingMetaDto((int) objectResponseDotNetDto.getTotalRecords(), 1)
		);

		if (objectResponseDotNetDto.getData() == null) {
			throw new RecordNotFoundException("Not found");
		}

		return ResponseEntity.ok().headers(responseHeaders).body(openBankingSucessDto);
	}
	
}
