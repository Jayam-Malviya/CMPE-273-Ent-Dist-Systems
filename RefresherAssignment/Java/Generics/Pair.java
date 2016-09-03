package com.darkRealm;

/**
 * Created by Jayam on 9/3/2016.
 */
public class Pair <T> {
    T _first;
    T _second;

    public Pair(T first, T second) {
        _first = first;
        _second = second;
    }

    public T getFirst() {
        return _first;
    }

    public T getSecond() {
        return _second;
    }

    public void setFirst(T first) {
        _first = first;
    }

    public void setSecond(T second) {
        _second = second;
    }
}
