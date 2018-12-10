package com.polytech.serenity.steps.serenity;

import com.polytech.*;
import com.polytech.serenity.pages.HomePage;
import com.polytech.serenity.pages.LoginPage;


public class ConnexionStep {

	HomePage homePage;

	LoginPage loginPage;

	public void openAmazonHome() {
        homePage.open();
    }

    public void login(String username, String password){
		loginPage.enterEmail(username);
		loginPage.enterPassword(password);
		loginPage.validate();
	}

    public void openLoginPage() {
	    loginPage.open();
    }

    public String getLoginErrorMessage(){
	    return loginPage.getErrorMessage();
    }

    public String getPasswordErrorMessage(){
	    return loginPage.getErrorMessage();
    }

    public String getLoggedText(){return homePage.getLoggedText();}

    public void logout (){
        homePage.logout();
    }

}

