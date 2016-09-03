package com.darkRealm;

/**
 * Created by Jayam on 9/2/2016.
 */
public class Inventory {

    Product[][] _storageShelves;
    private int _columns;

    public Inventory(int columns) {
        _columns = columns;
        _storageShelves = new Product[Category.values().length][columns];
        magicallyFillInventory();
    }

    public Product fetchProductByCategoryAndLocation(Category ctg, int location) {
        if (location < _columns) {
            Product prd = _storageShelves[ctg.getValue()][location];
            return prd;
        }
        return null;
    }

    public  void magicallyFillInventory(){
        for(int i=0; i<Category.values().length;i++){
            for(int j=0;j<_columns;j++){
                _storageShelves[i][j] = new Product(Category.Shoes,Category.Shoes.toString()+j);
            }
        }
    }
}
