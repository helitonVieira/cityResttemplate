package com.citi.InvestmentProducts.dto;

public class OpenBankingMetaDto {

	private Boolean success;
	private Integer totalRecords;
	
	public OpenBankingMetaDto(Boolean success, Integer totalRecords) {
		this.success = success;
		this.totalRecords = totalRecords;		
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	
	public Integer getTotalRecords() {
		return totalRecords;
	}

	public void setTotalRecords(Integer totalRecords) {
		this.totalRecords = totalRecords;
	}
	
}
