package model;

public class Latte implements Coffee {
    @Override
    public void prepare() {
        System.out.println("Preparing smooth Latte with milk.");
    }
}