package com.uiautomation.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import net.thucydides.core.pages.WebElementFacade;

public class GoogleSearchPage extends PageObject {
	@FindBy(name = "q")
	private WebElementFacade  searchInputField;

	@WhenPageOpens
	public void waitUntilGoogleLogoAppears() {
		searchInputField.waitUntilVisible();
	}

	public void searchFor(String searchRequest) {
		element(searchInputField).clear();
		element(searchInputField).typeAndEnter(searchRequest);
	}
}
