package com.citi.InvestmentProducts.dto;

import java.util.List;

public class GracePeriodsDto {
	private String range;
	private List<CategoriaFaixasDto> categoriaFaixas;
	
	
	public String getRange() {
		return range;
	}
	
	public void setRange(String range) {
		this.range = range;
	}

	public List<CategoriaFaixasDto> getCategoriaFaixas() {
		return categoriaFaixas;
	}

	public void setCategoriaFaixas(List<CategoriaFaixasDto> categoriaFaixas) {
		this.categoriaFaixas = categoriaFaixas;
	}	
	

}
