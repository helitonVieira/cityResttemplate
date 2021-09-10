package com.citi.InvestmentProducts.dto;

public class OpenBankingSucessDto extends OpenBankingDto {

	private Object data;
	private OpenBankingLinkDto links;
	
	public OpenBankingSucessDto() {
		super();
	}

	public OpenBankingSucessDto(Object data, OpenBankingLinkDto links, OpenBankingMetaDto openBankingMetaDto) {
		super(openBankingMetaDto);
		this.data = data;
		this.links = links;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public OpenBankingLinkDto getLinks() {
		return links;
	}

	public void setLinks(OpenBankingLinkDto links) {
		this.links = links;
	}

}
