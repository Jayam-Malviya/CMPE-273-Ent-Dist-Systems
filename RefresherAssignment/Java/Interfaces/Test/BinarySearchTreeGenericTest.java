package com.darkRealm.Test;

import com.darkRealm.BinarySearchTreeGeneric;
import com.darkRealm.CustomTreeElement;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Jayam on 9/3/2016.
 */
public class BinarySearchTreeGenericTest {

    @Test
    public void isEmptyShouldReturnTrueIfTreeEmpty() {
        BinarySearchTreeGeneric<CustomTreeElement> cbst = new BinarySearchTreeGeneric();
        assertTrue(cbst.isEmpty());
    }

}