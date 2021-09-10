package com.citi.InvestmentProducts.dto;

import java.util.List;

public class InvestmentProductsDto {

	private String cnpj;
	private List<CategoriesDto> categories;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<CategoriesDto> getCategories() {
		return categories;
	}

	public void setCategories(List<CategoriesDto> categories) {
		this.categories = categories;
	}

}
