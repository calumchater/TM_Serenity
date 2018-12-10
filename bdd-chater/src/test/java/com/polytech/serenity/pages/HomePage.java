package com.polytech.serenity.pages;

import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://www.amazon.fr")
public class HomePage extends PageObject {

	@Managed
	private  WebDriver driver;

	@FindBy(css="#twotabsearchtextbox")
    private WebElement searchBar;

    @FindBy(css="#nav-your-amazon")
    private WebElement textLangue;

    @FindBy(css="#nav-link-yourAccount > span.nav-line-1")
    private WebElement textLoggedName;

    @FindBy(css="#nav-item-signout > span")
    private WebElement deconnection;
	
	public HomePage(WebDriver driver) {
		super(driver);
	}

    public String getLangueText(){
	    return textLangue.getText();
    }

    public String getLoggedText(){
        return textLoggedName.getText();
    }

    public void logout(){
	    deconnection.click();
    }

}

