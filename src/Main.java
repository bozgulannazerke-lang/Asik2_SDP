import factory.CoffeeFactory;
import factory.EspressoFactory;
import factory.ItalianMenuFactory;
import factory.LatteFactory;
import factory.VeganMenuFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Part A: Factory Method ===");
        CoffeeFactory espressoFactory = new EspressoFactory();
        espressoFactory.orderCoffee();

        CoffeeFactory latteFactory = new LatteFactory();
        latteFactory.orderCoffee();

        System.out.println("\n=== Part B: Abstract Factory ===");
        CoffeeOrderClient italianOrder = new CoffeeOrderClient(new ItalianMenuFactory());
        italianOrder.serveOrder();

        System.out.println();
        CoffeeOrderClient veganOrder = new CoffeeOrderClient(new VeganMenuFactory());
        veganOrder.serveOrder();
    }
}