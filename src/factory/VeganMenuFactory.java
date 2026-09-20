package factory;

import model.Coffee;
import model.Dessert;
import model.Latte;
import model.VeganChiaPudding;

public class VeganMenuFactory implements CoffeeShopMenuFactory {
    @Override
    public Coffee createCoffee() {
        return new Latte();
    }

    @Override
    public Dessert createDessert() {
        return new VeganChiaPudding();
    }
}