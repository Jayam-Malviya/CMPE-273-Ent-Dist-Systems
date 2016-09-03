package com.darkRealm;

/**
 * Created by Jayam on 9/2/2016.
 */
public class Product {
    private String _name;
    private Category _category;

    public Product(Category ctg, String name){
        _category = ctg;
        _name = name;
    }

    @Override
    public String toString(){
        return "Name : "+_name+" Category : "+_category;
    }
}
