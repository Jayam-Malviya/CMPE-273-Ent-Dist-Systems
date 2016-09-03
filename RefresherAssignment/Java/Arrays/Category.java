package com.darkRealm;

/**
 * Created by Jayam on 9/2/2016.
 */
public enum Category {

    Shoes(0),
    Clothes(1),
    Electronics(2);
    private final int _value;

    Category(int val){
        _value = val;
    }

    public int getValue(){
        return _value;
    }
}
