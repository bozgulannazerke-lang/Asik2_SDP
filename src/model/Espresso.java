package model;

public class Espresso implements Coffee {
    @Override
    public void prepare() {
        System.out.println("Preparing strong Espresso coffee.");
    }
}