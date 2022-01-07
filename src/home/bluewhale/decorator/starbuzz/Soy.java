package home.bluewhale.decorator.starbuzz;

public class Soy extends CondimentDecorator {


    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        double cost = beverage.cost();

        switch (beverage.getSize()) {
            case SMALL -> cost += .10;
            case MIDDLE -> cost += .15;
            case GRAND -> cost += .20;
        }

        return cost;
    }
}
