package com.reto.demoblaze.tasks;

import com.reto.demoblaze.interactions.AddUpPrices;
import com.reto.demoblaze.userinterfaces.HomePage;
import com.reto.demoblaze.utils.Constants;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;


public class AddProducts implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(HomePage.SELECT.of(Constants.PHONES_CATEGORY)),
                Click.on(HomePage.SELECT.of(Constants.SAMSUNG_GALAXY_S6)),
                Click.on(HomePage.ADD_TO_CART_BTN),

                JavaScriptClick.on(HomePage.SELECT.of(Constants.HOME_BTN)),
                Click.on(HomePage.SELECT.of(Constants.PHONES_CATEGORY)),
                Click.on(HomePage.SELECT.of(Constants.IPHONE_6_32GB)),
                Click.on(HomePage.ADD_TO_CART_BTN),

                JavaScriptClick.on(HomePage.SELECT.of(Constants.HOME_BTN)),
                Click.on(HomePage.SELECT.of(Constants.LAPTOPS_CATEGORY)),
                Click.on(HomePage.SELECT.of(Constants.DELL_I7_8GB)),
                Click.on(HomePage.ADD_TO_CART_BTN),

                JavaScriptClick.on(HomePage.SELECT.of(Constants.HOME_BTN)),
                Click.on(HomePage.SELECT.of(Constants.LAPTOPS_CATEGORY)),
                Click.on(HomePage.SELECT.of(Constants.MACBOOK_PRO)),
                Click.on(HomePage.ADD_TO_CART_BTN),

                JavaScriptClick.on(HomePage.SELECT.of(Constants.HOME_BTN)),
                Click.on(HomePage.SELECT.of(Constants.MONITORS_CATEGORY)),
                Click.on(HomePage.SELECT.of(Constants.APPLE_MONITOR_24)),
                Click.on(HomePage.ADD_TO_CART_BTN),

                JavaScriptClick.on(HomePage.SELECT.of(Constants.HOME_BTN)),
                Click.on(HomePage.SELECT.of(Constants.MONITORS_CATEGORY)),
                Click.on(HomePage.SELECT.of(Constants.ASUS_FULL_HD)),
                Click.on(HomePage.ADD_TO_CART_BTN),

                JavaScriptClick.on(HomePage.CART_BTN),
                AddUpPrices.sumOfProduct()
        );
    }

    public static AddProducts chooseProduct() {
        return Tasks.instrumented(AddProducts.class);
    }
}
