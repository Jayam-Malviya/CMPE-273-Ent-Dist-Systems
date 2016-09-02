package com.darkRealm.Test;

import com.darkRealm.DumbBrowser;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Jayam on 9/2/2016.
 */
public class DumbBrowserTest {
    private DumbBrowser jromeTest = new DumbBrowser("www.test.com");

    @Test
    public void goingToNewUrlForwardUrlShouldBeEmpty() {
        jromeTest.navigateToNewURL("www.google.com");
        assertEquals(jromeTest.peekForwardUrl(), "");
    }


    @Test
    public void forwardUrlShouldBeOnlySetIfWentBackwards() {
        jromeTest.navigateToURL("www.google.com");
        jromeTest.navigateToURL("www.google.com/page1");
        jromeTest.navigateBackwards();
        assertEquals(jromeTest.peekForwardUrl(), "www.google.com/page1");
    }

    @Test
    public void initiallyBothStacksShouldBeEmptyAndCurrentShouldBeHomeUrl() {
        assertEquals("",jromeTest.peekBackwwardUrl());
        assertEquals("",jromeTest.peekForwardUrl());
        assertEquals("www.test.com",jromeTest.getCurrentUrl());
    }
}