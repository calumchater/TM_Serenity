package com.polytech.serenity.steps.serenity;

import com.polytech.serenity.pages.HomePage;
import com.polytech.serenity.pages.PanierPage;

public class AccessPanier {

	HomePage homePage;

	static PanierPage panierPage;

	public void openAmazonHome() {
        homePage.open();
    }

    public static void openPanier() {
	    panierPage.open();
    }
    
    
    
}

