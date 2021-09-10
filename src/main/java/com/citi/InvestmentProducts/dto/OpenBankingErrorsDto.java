package com.citi.InvestmentProducts.dto;

import java.util.List;

public class OpenBankingErrorsDto extends OpenBankingDto {

	private List<OpenBankingErrorDto> errors;
	
	public OpenBankingErrorsDto(List<OpenBankingErrorDto> errors) {
		super();
		this.errors = errors;
	}

	public List<OpenBankingErrorDto> getErrors() {
		return errors;
	}

	public void setErrors(List<OpenBankingErrorDto> errors) {
		this.errors = errors;
	}

}
