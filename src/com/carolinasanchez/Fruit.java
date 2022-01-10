package com.carolinasanchez;

public class Fruit {
    private String name;
    private double price;
    private int inventory;

    public Fruit(String name, double price, int inventory) {
        this.name = name;
        this.price = price;
        this.inventory = inventory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return "This is a " + this.name + " and it costs " + this.price + ". There are " + this.inventory + " left.";
    }
}
