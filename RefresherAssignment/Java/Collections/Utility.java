package com.darkRealm;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Jayam on 9/3/2016.
 */
public class Utility {

    public static int[] calculateIntersection(int[] arr, int[] brr) {

        HashSet<Integer> setA = new HashSet();
        for (int i = 0; i < arr.length; i++) {
            setA.add(arr[i]);
        }

        ArrayList<Integer> intersectionIntegers = new ArrayList<>();
        for (int i = 0; i < brr.length; i++) {

            boolean res = setA.contains(brr[i]);
            if (res) {
                intersectionIntegers.add(brr[i]);
            }
        }

        int[] intersectionInts = new int[intersectionIntegers.size()];

        for (int i = 0; i < intersectionIntegers.size(); i++) {
            intersectionInts[i] = intersectionIntegers.get(i).intValue();
        }

        return intersectionInts;
    }
}