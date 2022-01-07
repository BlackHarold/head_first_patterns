package home.bluewhale.decorator.starbuzz;

public abstract class Beverage {

    public enum Size {SMALL, MIDDLE, GRAND}

    Size size = Size.SMALL;

    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public abstract double cost();
}
