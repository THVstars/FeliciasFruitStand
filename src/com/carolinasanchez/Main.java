package com.carolinasanchez;

import java.util.ArrayList;

public class Main {

    static Fruit apple;
    static Fruit orange;
    static Fruit banana;
    static ArrayList<Fruit> feliciasFruitList = new ArrayList<>();
    static ArrayList<Integer> feliciasInventory = new ArrayList<>();
    static Stand fruitStand;
    static int sum;
    static int remainder;

    public static void main(String[] args) {
        apple = new Fruit("apple", 1.50, 5);
        orange = new Fruit("orange", 1.50, 9);
        banana = new Fruit("banana", 20.00, 10);

        System.out.println(apple.toString());

        feliciasFruitList.add(apple);
        feliciasFruitList.add(orange);
        feliciasFruitList.add(banana);

        feliciasInventory.add(apple.getInventory());
        feliciasInventory.add(orange.getInventory());
        feliciasInventory.add(banana.getInventory());

        fruitStand = new Stand("Felicia's Fruit Stand", feliciasFruitList, feliciasInventory);

        //System.out.println(fruitStand.getFruitsList_());
        //System.out.println(fruitStand.getInventoryList_());

        System.out.println(feliciasInventory + " -Initial Inventory.");
        System.out.println(addInventory("apple", 5) + " -Added 5 apples.");
        System.out.println(addInventory("orange", 5) + " -Added 5 oranges.");
        System.out.println(addInventory("banana", 5) + " -Added 5 bananas.");
        System.out.println(sellsFruit("apple", 10) + " -Subtracted 10 apples.");
        System.out.println(sellsFruit("orange", 10) + " -Subtracted 10 oranges.");
        System.out.println(sellsFruit("banana", 10) + " -Subtracted 10 bananas.");

        System.out.println(fruitStand.getInventoryList_() + " -Check: Current Inventory in the fruitStand ArrayList.");


    }

    public static ArrayList<Integer> addInventory(String fruitName, int fruitAddInventory) {

        for (int i = 0; i < feliciasFruitList.size(); i++) {
            if (fruitName.equals(feliciasFruitList.get(i).getName())) {
                sum = feliciasInventory.get(i) + fruitAddInventory;
                feliciasInventory.set(i, sum);
                apple.setInventory(feliciasInventory.get(0));
                orange.setInventory(feliciasInventory.get(1));
                banana.setInventory(feliciasInventory.get(2));
                System.out.println(orange.getInventory()); // prints before the array because it prints before the return.
                //System.out.println(i);
            }
        } return feliciasInventory;

        /*if (fruitName == apple.getName()) {
            sum = feliciasInventory.get(0) + fruitAddInventory;
        } else if (fruitName == orange.getName()) {
            sum = feliciasInventory.get(1) + fruitAddInventory;
        } else if (fruitName == banana.getName()) {
            sum = feliciasInventory.get(2) + fruitAddInventory;
        }
        return sum;*/
    }

    public static ArrayList<Integer> sellsFruit(String fruitName, int fruitRemoveInventory) {
        for (int i = 0; i < feliciasFruitList.size(); i++) {
            if (fruitName.equals(feliciasFruitList.get(i).getName())) {
                remainder = feliciasInventory.get(i) - fruitRemoveInventory;
                feliciasInventory.set(i, remainder);
                apple.setInventory(feliciasInventory.get(0));
                orange.setInventory(feliciasInventory.get(1));
                banana.setInventory(feliciasInventory.get(2));
                System.out.println(orange.getInventory());
                //System.out.println(i);
            }
        }
        return feliciasInventory;
    }

        /* if (fruitName == apple.getName()) {
            remainder = feliciasInventory.get(0) - fruitRemoveInventory;
        } else if (fruitName == orange.getName()) {
            remainder = feliciasInventory.get(1) - fruitRemoveInventory;
        } else if (fruitName == banana.getName()) {
            remainder = feliciasInventory.get(2) - fruitRemoveInventory;
        }
        return remainder;
    }*/
}
