package com.citi.InvestmentProducts.config.swagger;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {
	
	@Bean
	public Docket fixedIncomeDealsPositionApi() {
		return new Docket(DocumentationType.OAS_30)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.citi.InvestmentProducts"))
				.paths(PathSelectors.ant("/**"))
				.build()
				.apiInfo(getApiInfo());
	}
	
    private ApiInfo getApiInfo() {
    	return new ApiInfo(
    		"Restfull API with Spring Boot 2.5.2",
      		"",
      		"v1.0.0",
      		"",
      		new Contact("TO Brasil","domínio", "https://to-brasil.com/"),
      		"",
      		"",
      		Collections.emptyList()
      	);
    }
	
}
