package com.polytech;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.*;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/gestion_compte/Connexion.feature")
public class Connexion {}
