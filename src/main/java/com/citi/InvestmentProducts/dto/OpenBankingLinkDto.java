package com.citi.InvestmentProducts.dto;

public class OpenBankingLinkDto {

	private String self;
	private String first;
	private String prev;
	private String next;
	private String last;
	
	public OpenBankingLinkDto() {
	}
	
	public OpenBankingLinkDto(String self) {
		this.self = self;
	}

	public String getSelf() {
		return self;
	}

	public void setSelf(String self) {
		this.self = self;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getPrev() {
		return prev;
	}

	public void setPrev(String prev) {
		this.prev = prev;
	}

	public String getNext() {
		return next;
	}

	public void setNext(String next) {
		this.next = next;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

}
