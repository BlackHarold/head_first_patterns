package home.bluewhale.strategy;

import home.bluewhale.strategy.client.Duck;
import home.bluewhale.strategy.client.RubberDuck;
import home.bluewhale.strategy.interfaces.fly.FlyWithWings;
import home.bluewhale.strategy.interfaces.quack.Quack;

public class Strategy {
    public static void main(String[] args) {

        //#1 Strategy
        Duck duck = new RubberDuck();
        duck.setFb(new FlyWithWings());
        duck.setQb(new Quack());
    }
}
