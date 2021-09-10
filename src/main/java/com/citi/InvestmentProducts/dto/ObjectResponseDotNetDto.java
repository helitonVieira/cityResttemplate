package com.citi.InvestmentProducts.dto;

public class ObjectResponseDotNetDto {
	private Boolean success;
	private Long totalRecords;
	private InvestmentProductsDto data;

	public OpenBankingSucessDto converterOpenBankingSucessDto(
		OpenBankingLinkDto openBankingLinkDto,
		OpenBankingMetaDto openBankingMetaDto
	) {
		OpenBankingSucessDto openBankingSucessDto = new OpenBankingSucessDto(
			data, 
			openBankingLinkDto,
			openBankingMetaDto
		);

		return openBankingSucessDto;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public long getTotalRecords() {
		return totalRecords;
	}

	public void setTotalRecords(Long totalRecords) {
		this.totalRecords = totalRecords;
	}

	public InvestmentProductsDto getData() {
		return data;
	}

	public void setData(InvestmentProductsDto data) {
		this.data = data;
	}

}
