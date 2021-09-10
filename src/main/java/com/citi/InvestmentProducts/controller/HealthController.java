package com.citi.InvestmentProducts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@Api(value = "Consult Health", tags = "ConsultHealth")
@RestController
@RequestMapping("health")
public class HealthController {
	
	@ResponseBody
	@GetMapping(path = "", produces = { "application/json" })
	public String consultCustomerPosition() {

		return "OK";
	}
	
}
