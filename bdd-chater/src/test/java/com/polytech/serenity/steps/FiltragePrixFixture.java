package com.polytech.serenity.steps;

import cucumber.api.PendingException;
import com.polytech.*;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FiltragePrixFixture {

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
