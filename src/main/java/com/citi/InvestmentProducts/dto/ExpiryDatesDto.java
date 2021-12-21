package com.citi.InvestmentProducts.dto;

import java.util.List;

public class ExpiryDatesDto {
	private String range;
	private List<GracePeriodsDto> gracePeriods;
	
	
	public String getRange() {
		return range;
	}
	public void setRange(String range) {
		this.range = range;
	}
	public List<GracePeriodsDto> getGracePeriods() {
		return gracePeriods;
	}
	public void setGracePeriods(List<GracePeriodsDto> gracePeriods) {
		this.gracePeriods = gracePeriods;
	}

	

}
