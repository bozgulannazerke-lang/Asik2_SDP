import factory.CoffeeShopMenuFactory;
import model.Coffee;
import model.Dessert;

public class CoffeeOrderClient {
    private Coffee coffee;
    private Dessert dessert;

    public CoffeeOrderClient(CoffeeShopMenuFactory factory) {
        if (factory == null) {
            throw new IllegalArgumentException("Factory cannot be null");
        }
        this.coffee = factory.createCoffee();
        this.dessert = factory.createDessert();
    }

    public void serveOrder() {
        coffee.prepare();
        dessert.serve();
    }
}