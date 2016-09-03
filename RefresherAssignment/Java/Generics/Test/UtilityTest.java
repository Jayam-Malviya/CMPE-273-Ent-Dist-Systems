package com.darkRealm.Test;

import com.darkRealm.Pair;
import com.darkRealm.Stock;
import com.darkRealm.Utility;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Jayam on 9/3/2016.
 */
public class UtilityTest {

    @Test
    public void PairShouldBeEmptyIfArrayIsZeroLength(){
        Stock[] emptyStock = new Stock[0];
        Pair pair = Utility.findMinMax(emptyStock);
        assertNull(pair.getFirst());
        assertNull(pair.getSecond());
    }

    @Test
    public void PairShouldBeSameMemberIfArrayHasOnlyOneElement() {
        Stock[] stocks = new Stock[]{new Stock("Walmart", 98)};
        Pair pair = Utility.findMinMax(stocks);
        assertEquals(stocks[0], pair.getFirst());
        assertEquals(stocks[0], pair.getSecond());
    }

    @Test
    public void UtilityShouldGiveValidResult() {
        Stock[] stocks = new Stock[]{new Stock("Alphabet",99),new Stock("Walmart", 98)};
        Pair pair = Utility.findMinMax(stocks);
        assertEquals(stocks[1], pair.getFirst());
        assertEquals(stocks[0], pair.getSecond());
    }
}