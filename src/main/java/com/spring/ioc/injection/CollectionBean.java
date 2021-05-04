package com.spring.ioc.injection;

import java.util.List;

public class CollectionBean {
	private List<String> number;
	
	public void setNumber(List<String> number) {
		this.number = number;
	}
	public List<String> getNumber(){
		return number;
	}

}
