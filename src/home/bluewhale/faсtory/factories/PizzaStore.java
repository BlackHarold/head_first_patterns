package home.bluewhale.faсtory.factories;

import home.bluewhale.faсtory.Pizza;

public abstract class PizzaStore {


    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);
        System.out.println(type + " pizza ordered. style is: " + this);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    abstract Pizza createPizza(String type);
}
