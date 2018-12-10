package com.polytech.serenity.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.polytech.*;



public class RechercheArticleFixture {

    @When("^L'utilisateur recherche le produit (.*)$")
    public void lUtilisateurRechercheLeProduitProduit(String string) throws Throwable {
    	
        throw new PendingException();
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
