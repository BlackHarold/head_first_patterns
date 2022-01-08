package home.bluewhale.faсtory.factories;

import home.bluewhale.faсtory.Pizza;
import home.bluewhale.faсtory.types.*;

public class SimpleFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        switch (type) {
            case "cheese" -> pizza = new CheesePizza();
            case "pepperoni" -> pizza = new PepperoniPizza();
            case "clam" -> pizza = new ClamPizza();
            case "veggie" -> new VeggiePizza();
        }

        return pizza;
    }
}
