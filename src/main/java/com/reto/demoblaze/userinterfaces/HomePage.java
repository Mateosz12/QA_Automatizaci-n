package com.reto.demoblaze.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
// paginas de navegación por las que va a pasar el usuario, por principios de unica responsabilidad
public class HomePage extends PageObject {

    public static final Target SELECT = Target.the("select category or product")
            .locatedBy("//a[contains (text(), '{0}')]");
    public static final Target ADD_TO_CART_BTN = Target.the("select the add to cart button")
            .locatedBy("//a[@class='btn btn-success btn-lg']");
    public static final Target CART_BTN = Target.the("select cart button")
            .located(By.id("cartur"));

}
