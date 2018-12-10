package com.polytech;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.CucumberWithSerenity;

import cucumber.*;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/gestion_panier/ajout_panier.feature")
public class Ajout_Panier{}
