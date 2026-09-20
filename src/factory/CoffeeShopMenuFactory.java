package factory;

import model.Coffee;
import model.Dessert;

public interface CoffeeShopMenuFactory {
    Coffee createCoffee();
    Dessert createDessert();
}