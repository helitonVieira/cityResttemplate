package com.citi.InvestmentProducts.dto;

public class OpenBankingMetaDto {

	private Integer totalRecords;
	private Integer totalPages;
	
	public OpenBankingMetaDto(Integer totalRecords, Integer totalPages) {
		this.totalRecords = totalRecords;
		this.totalPages = totalPages;
	}

	public Integer getTotalRecords() {
		return totalRecords;
	}

	public void setTotalRecords(Integer totalRecords) {
		this.totalRecords = totalRecords;
	}

	public Integer getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}

}
