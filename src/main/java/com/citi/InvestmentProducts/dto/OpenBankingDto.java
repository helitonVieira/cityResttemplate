package com.citi.InvestmentProducts.dto;

public class OpenBankingDto {

	private OpenBankingMetaDto meta;
	
	public OpenBankingDto() {
	}
	
	public OpenBankingDto(OpenBankingMetaDto meta) {
		this.meta = meta;
	}

	public OpenBankingMetaDto getMeta() {
		return meta;
	}

	public void setMeta(OpenBankingMetaDto meta) {
		this.meta = meta;
	}

}
