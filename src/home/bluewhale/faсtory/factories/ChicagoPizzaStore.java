package home.bluewhale.faсtory.factories;

import home.bluewhale.faсtory.Pizza;
import home.bluewhale.faсtory.types.CheesePizza;
import home.bluewhale.faсtory.types.ClamPizza;
import home.bluewhale.faсtory.types.PepperoniPizza;
import home.bluewhale.faсtory.types.VeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

    String style = "Chicago style";

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        switch (type) {
            case "cheese" -> pizza = new CheesePizza();
            case "pepperoni" -> pizza = new PepperoniPizza();
            case "clam" -> pizza = new ClamPizza();
            case "veggie" -> pizza = new VeggiePizza();
        }

        return pizza;
    }

    @Override
    public String toString() {
        return style;
    }
}
