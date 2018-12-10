package com.polytech.serenity.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import static junit.framework.TestCase.assertEquals;
import com.polytech.*;
import com.polytech.serenity.steps.serenity.ConnexionStep;


public class ConnexionFixture {

	@Steps
    ConnexionStep connexionStep;
    
    @Given("L'utilisateur est connecte")
    public void userConnected() {
        connexionStep.openLoginPage();
        connexionStep.login("tmcalum@gmail.com", "tmcalum");
    }


    @When("^L'utilisateur rentre son (.*) et son (.*)$")
    public void lUtilisateurRentreSonEmailEtSonPassword(String email, String password) throws Throwable {
        connexionStep.login(email, password);
    }

    @Then("^Le message d'erreur de mauvais mot de passe s'affiche$")
    public void leMessageDErreurDeMauvaisMotDePasseSAffiche() throws Throwable {
        assertEquals(connexionStep.getPasswordErrorMessage(),"Votre mot de passe est incorrect");
    }


    @Then("^Le message d'erreur d'indentifiant s'affiche$")
    public void leMessageDErreurDIndentifiantSAffiche() throws Throwable {
        assertEquals(connexionStep.getLoginErrorMessage(),"Impossible de trouver un compte correspondant à cette adresse e-mail");
    }

    @Given("^l'utilisateur est sur la page login$")
    public void lUtilisateurEstSurLaPageLogin() throws Throwable {
        connexionStep.openLoginPage();
    }

    @Then("^L'utilisateur est bien connecte$")
    public void lUtilisateurEstBienConnecte() throws Throwable {
        assertEquals(connexionStep.getLoggedText(), "Bonjour Chater");
    }

    @When("^l'utilisateur clique sur se deconnecter$")
    public void lUtilisateurCliqueSurSeDeconnecter() throws Throwable {
        connexionStep.logout();
    }

    @Then("^L'utilisateur est déconnecte$")
    public void lUtilisateurEstDéconnecte() throws Throwable {
        assertEquals(connexionStep.getLoggedText(), "Bonjour. Identifiez-vous");
    }
}
