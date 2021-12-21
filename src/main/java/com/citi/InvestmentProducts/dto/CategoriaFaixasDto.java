package com.citi.InvestmentProducts.dto;

import java.math.BigDecimal;

public class CategoriaFaixasDto {
	
	private String titulo;
	private String mediana;
	private BigDecimal frequencia;
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getMediana() {
		return mediana;
	}
	
	public void setMediana(String mediana) {
		this.mediana = mediana;
	}
	
	public BigDecimal getFrequencia() {
		return frequencia;
	}
	
	public void setFrequencia(BigDecimal frequencia) {
		this.frequencia = frequencia;
	}	

}
