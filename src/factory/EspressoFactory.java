package factory;

import model.Coffee;
import model.Espresso;

public class EspressoFactory extends CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new Espresso();
    }
}