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

            for(int j=0;j<_columns;j++){
                _storageShelves[0][j] = new Product(Category.Shoes,Category.Shoes.toString()+j);
            }


	 for(int j=0;j<_columns;j++){	
                _storageShelves[1][j] = new Product(Category.Clothes,Category.Clothes.toString()+j);
            }

	 for(int j=0;j<_columns;j++){	
                _storageShelves[2][j] = new Product(Category.Electronics,Category.Electronics.toString()+j);
            }
    }
}
