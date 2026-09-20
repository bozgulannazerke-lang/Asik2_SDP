package factory;

import model.Coffee;
import model.Dessert;
import model.Espresso;
import model.Tiramisu;

public class ItalianMenuFactory implements CoffeeShopMenuFactory {
    @Override
    public Coffee createCoffee() {
        return new Espresso();
    }

    @Override
    public Dessert createDessert() {
        return new Tiramisu();
    }
}