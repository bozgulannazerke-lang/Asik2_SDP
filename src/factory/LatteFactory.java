package factory;

import model.Coffee;
import model.Latte;

public class LatteFactory extends CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new Latte();
    }
}