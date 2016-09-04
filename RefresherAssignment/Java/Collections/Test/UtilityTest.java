package com.darkRealm;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Jayam on 9/3/2016.
 */
public class UtilityTest {

    @Test
    public void intersectionShouldBeEmptyIfNoElementsMatch(){
        int[] arr = new int[]{11,22,33,44,55};
        int[] brr = new int[]{66,77,88,99,100};
        int [] intersection = Utility.calculateIntersection(arr,brr);
        assertEquals(0,intersection.length);
    }

    @Test
    public void intersectionShouldBeCorrectIfElementsMatch(){
        int[] arr = new int[]{11,22,33,44,55};
        int[] brr = new int[]{66,77,88,99,55};
        int [] intersection = Utility.calculateIntersection(arr,brr);
        assertEquals(1,intersection.length);
        assertEquals(55,intersection[0]);
    }
}