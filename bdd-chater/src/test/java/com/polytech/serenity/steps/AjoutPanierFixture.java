package com.polytech.serenity.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.polytech.*;
import com.polytech.serenity.steps.serenity.AccessPanier;


public class AjoutPanierFixture {

    @When("^L'utilisateur recherche le produit (.*)$")
    public void lUtilisateurRechercheLeProduitProduit(String string) throws Throwable {
    	
        throw new PendingException();
    }
    
    @Given("^l'utilisateur est sur la page panier$")
    public void lUtilisateurEstSurLaPagePanier() throws Throwable {
        AccessPanier.openPanier();
    }
    
    @Then("^L'utilisateur est sur la page du produit$")
    public void lUtilisateurEstSurLaPageDuProduit() throws Throwable {
    	
        throw new PendingException();
    }

    @Then("^Un message d'erreur s'affiche$")
    public void unMessageDErreurSAffiche() throws Throwable {

    	throw new PendingException();
    }
}
