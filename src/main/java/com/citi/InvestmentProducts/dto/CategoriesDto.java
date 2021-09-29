package com.citi.InvestmentProducts.dto;

import java.util.List;

public class CategoriesDto {
	
	private String title;
	private long count;
	private List<FaixasDto> faixas;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<FaixasDto> getFaixas() {
		return faixas;
	}

	public void setFaixas(List<FaixasDto> faixas) {
		this.faixas = faixas;
	}
	
	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}
}
