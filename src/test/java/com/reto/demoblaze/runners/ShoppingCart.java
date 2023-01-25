package com.reto.demoblaze.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/shopping_cart.feature", // donde se encuentra el
        glue = "com.reto.demoblaze.stepdefinitions", // pegar lo que se genera del feature
        snippets = SnippetType.CAMELCASE //formato camelcase
)

public class ShoppingCart {
}
