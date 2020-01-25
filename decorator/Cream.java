public class Cream extends CondimentDecorator {
    Beverage beverage;

    public Cream(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Cream";
    }

    public double cost() {
        return .10 + beverage.cost();
    }
}

