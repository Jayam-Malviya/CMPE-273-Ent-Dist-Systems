package com.darkRealm.Test;

import com.darkRealm.Category;
import com.darkRealm.Inventory;
import com.darkRealm.Product;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Jayam on 9/2/2016.
 */
public class InventoryTest {

    Inventory inventory = new Inventory(3);

    @Test
    public void returnNullIfLocationisNotInShelf() {
        Product prd = inventory.fetchProductByCategoryAndLocation(Category.Shoes, 5);
        assertEquals(null, prd);
    }

    @Test
    public void returnProductIfProductCanBeLocated() {
        Product prd = inventory.fetchProductByCategoryAndLocation(Category.Shoes, 2);
        assertNotNull(prd);
    }
}