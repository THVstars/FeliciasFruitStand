package com.carolinasanchez;

import java.util.ArrayList;

public class Stand { // class variables
    private String nameOfStand_;
    private ArrayList<Fruit> fruitsList_; // {apple, banana, orange}
    private ArrayList<Integer> inventoryList_;

    public Stand(String nameOfStand, ArrayList<Fruit> fruitsList, ArrayList<Integer> inventoryList) {
        this.nameOfStand_ = nameOfStand;
        this.fruitsList_ = fruitsList;
        this.inventoryList_ = inventoryList;
    } // constructor

    public String getNameOfStand_() {
        return nameOfStand_;
    } // getter

    public void setNameOfStand_(String nameOfStand_) {
        this.nameOfStand_ = nameOfStand_;
    } // setter

    public ArrayList<Fruit> getFruitsList_() {
        return fruitsList_;
    }

    public void setFruitsList_(ArrayList<Fruit> fruitsList_) {
        this.fruitsList_ = fruitsList_;
    }

    public ArrayList<Integer> getInventoryList_() {
        return inventoryList_;
    }

    public void setInventoryList_(ArrayList<Integer> inventoryList_) {
        this.inventoryList_ = inventoryList_;
    }

    //create two methods.
    //they're both going to be to change inventory
    //one takes in a name of a fruit and adds inventory when felicia gets stock.
    //one takes in a name of a fruit and how many she's selling and subtracts that number.
}
