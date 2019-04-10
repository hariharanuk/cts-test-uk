package com.cts.vo;

public enum CurrencyEnum {
	GBP("£"), USD("$"), EUR("€");
	
	private String value;
	
	CurrencyEnum(String value){
        this.value = value;
    }

    public String getResponse() {
        return value;
    }

    
}
