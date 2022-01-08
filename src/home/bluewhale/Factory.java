package home.bluewhale;

import home.bluewhale.faсtory.factories.ChicagoPizzaFactory;
import home.bluewhale.faсtory.factories.ChicagoPizzaStore;
import home.bluewhale.faсtory.factories.NYPizzaFactory;
import home.bluewhale.faсtory.factories.NYPizzaStore;

public class Factory {

    public static void main(String[] args) {
        NYPizzaFactory NYPizzaFactory = new NYPizzaFactory();
        NYPizzaStore nycStore = new NYPizzaStore();
//        nycStore.createPizza("veggie");
        nycStore.orderPizza("cheese");

        ChicagoPizzaFactory chicagoPizzaFactory = new ChicagoPizzaFactory();
        ChicagoPizzaStore chiStore = new ChicagoPizzaStore();
//        chiStore.createPizza("veggie");
        chiStore.orderPizza("veggie");
    }
}
