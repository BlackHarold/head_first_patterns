package home.bluewhale.strategy.client;

import home.bluewhale.strategy.interfaces.fly.FlyBehavior;
import home.bluewhale.strategy.interfaces.quack.QuackBehavior;

public abstract class Duck {
    FlyBehavior fb;
    QuackBehavior qb;

    public FlyBehavior getFb() {
        return fb;
    }

    public void setFb(FlyBehavior fb) {
        this.fb = fb;
    }

    public QuackBehavior getQb() {
        return qb;
    }

    public void setQb(QuackBehavior qb) {
        this.qb = qb;
    }
}
