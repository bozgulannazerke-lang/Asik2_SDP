package factory;

import model.Coffee;

public abstract class CoffeeFactory {
    public abstract Coffee createCoffee();

    public Coffee orderCoffee() {
        Coffee coffee = createCoffee();
        coffee.prepare();
        return coffee;
    }
}