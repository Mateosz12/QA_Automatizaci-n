package com.reto.demoblaze.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.questions.Text;

import static com.reto.demoblaze.userinterfaces.CartSection.PRODUCT_PRICE;

public class AddUpPrices implements Interaction {

    private int sumTotalProducts = 0;
    private static String priceTotal;

    public AddUpPrices() {
    }

    public static String getPriceTotal() {
        return priceTotal;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        for (int i = 1; i < 7; i++) {

            String label = Text.of(PRODUCT_PRICE.of(String.valueOf(i)).getCssOrXPathSelector()).answeredBy(actor);
            sumTotalProducts += Integer.parseInt(label);
            System.out.println("sum " + sumTotalProducts);
        }
        priceTotal = String.valueOf(sumTotalProducts);
    }
// obtener la suma del valor para poder compararla --- nos permite complir el requisito de sacar el valor los articulos

    public static AddUpPrices sumOfProduct() {
        return new AddUpPrices();
    }
}
