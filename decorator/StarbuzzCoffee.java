public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()
                + " $" + beverage.cost());
// Can do so...
        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Chocolate(beverage2);
        beverage2 = new Cream(beverage2);
        System.out.println(beverage2.getDescription()
                + " $" + beverage2.cost());
// or so...
        Beverage beverage3 = new Cream(new Chocolate(new Chocolate(new DarkRoast())));
        System.out.println(beverage3.getDescription()
                + " $" + beverage3.cost());
    }
}
