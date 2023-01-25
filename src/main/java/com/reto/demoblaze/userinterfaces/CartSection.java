package com.reto.demoblaze.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartSection {
    public static final Target TOTAL_PRICE = Target.the("get total price product")
            .located(By.id("totalp"));
    public static final Target PRODUCT_PRICE = Target.the("get product price ")
            .locatedBy("(//tr[@class='success']//td[3])[{0}]");
}
