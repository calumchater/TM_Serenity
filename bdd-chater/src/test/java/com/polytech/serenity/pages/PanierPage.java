package com.polytech.serenity.pages;

import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://www.amazon.fr/gp/cart/view.html?ref=nav_cart")
public class PanierPage extends PageObject {

	@Managed
	private  WebDriver driver;
	

    @FindBy(css="#sc-list-body sc-java-remote-feature")
    private WebElement itemlist;

	public PanierPage(WebDriver driver) {
		super(driver);
	}
	
	
}

