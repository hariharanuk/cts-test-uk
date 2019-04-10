package com.cts.model;

public enum CurrencyIconEnum {
	INR(""),GBP("£"), USD("$"), EUR("€");
	
	private String icon;

	CurrencyIconEnum(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return this.icon;
    }
}
