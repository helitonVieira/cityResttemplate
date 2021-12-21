package com.citi.InvestmentProducts.dto;

import java.math.BigDecimal;
import java.util.List;

public class CategoriesDto {
	
	private String categoria;
    private String indexador;
    private String indexadorOpcional;
    private long total;
    private String cnpj;
    private long liquidez;
    private BigDecimal faixaMinima;
    private BigDecimal faixaMaxima;
    private String contratacaoAutomatica;
    private String resgateAutomatico;
    private String publicoAlvo;
    private List<ExpiryDatesDto> expiryDates;  

	public String getCategoria() {
		return categoria;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public String getIndexador() {
		return indexador;
	}
	
	public void setIndexador(String indexador) {
		this.indexador = indexador;
	}
		
	public String getIndexadorOpcional() {
		return indexadorOpcional;
	}

	public void setIndexadorOpcional(String indexadorOpcional) {
		this.indexadorOpcional = indexadorOpcional;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
		
	public long getLiquidez() {
		return liquidez;
	}
	
	public void setLiquidez(long liquidez) {
		this.liquidez = liquidez;
	}
	
	public BigDecimal getFaixaMinima() {
		return faixaMinima;
	}
	
	public void setFaixaMinima(BigDecimal faixaMinima) {
		this.faixaMinima = faixaMinima;
	}
	
	public BigDecimal getFaixaMaxima() {
		return faixaMaxima;
	}
	
	public void setFaixaMaxima(BigDecimal faixaMaxima) {
		this.faixaMaxima = faixaMaxima;
	}
	
	public String getContratacaoAutomatica() {
		return contratacaoAutomatica;
	}

	public void setContratacaoAutomatica(String contratacaoAutomatica) {
		this.contratacaoAutomatica = contratacaoAutomatica;
	}

	public String getResgateAutomatico() {
		return resgateAutomatico;
	}

	public void setResgateAutomatico(String resgateAutomatico) {
		this.resgateAutomatico = resgateAutomatico;
	}

	public String getPublicoAlvo() {
		return publicoAlvo;
	}

	public void setPublicoAlvo(String publicoAlvo) {
		this.publicoAlvo = publicoAlvo;
	}	
	
	public List<ExpiryDatesDto> getExpiryDates() {
		return expiryDates;
	}

	public void setExpiryDates(List<ExpiryDatesDto> expiryDates) {
		this.expiryDates = expiryDates;
	}		
	
}
