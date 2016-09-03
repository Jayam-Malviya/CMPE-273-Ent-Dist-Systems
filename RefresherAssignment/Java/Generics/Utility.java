package com.darkRealm;

/**
 * Created by Jayam on 9/3/2016.
 */
public class Utility {

    public static <T extends Comparable> Pair findMinMax(T[] arr) {
        T min = arr[0];
        T max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (min.compareTo(arr[i]) > 0) {
                min = arr[i];
            }
            if (max.compareTo(arr[i]) < 0) {
                max = arr[i];
            }
        }
        return new Pair(min, max);
    }
}
