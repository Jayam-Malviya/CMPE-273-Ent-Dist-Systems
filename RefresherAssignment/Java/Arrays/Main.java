package com.darkRealm;

public class Main {

    public static void main(String[] args) {
        doInventory();
    }

    private static void doInventory(){
        Inventory inventory = new Inventory(3);
        inventory.magicallyFillInventory();
        Product prd = inventory.fetchProductByCategoryAndLocation(Category.Shoes,2);
        System.out.println("Product Fetched : "+prd.toString());
    }
}
