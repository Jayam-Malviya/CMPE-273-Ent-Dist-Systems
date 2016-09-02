package com.darkRealm;

public class Main {

    public static void main(String[] args) {

        DumbBrowser jrome = new DumbBrowser("www.homePage.com");
        navigateToNew_goBack_goForward(jrome);
        System.out.println("Now same tab navigation...");
        navigateToNew_sameTabUrl_goBack_goForward(jrome);
    }

    private static void navigateToNew_goBack_goForward(DumbBrowser jrome){
        jrome.navigateToNewURL("www.facebook.com");
        System.out.println("Current Url : "+jrome.getCurrentUrl());
        jrome.navigateBackwards();
        System.out.println("Current Url : "+jrome.getCurrentUrl());
        jrome.navigateForwards();
        System.out.println("Current Url : "+jrome.getCurrentUrl());
    }

    private static void navigateToNew_sameTabUrl_goBack_goForward(DumbBrowser jrome){
        jrome.navigateToNewURL("www.facebook.com");
        System.out.println("Current Url : "+jrome.getCurrentUrl());
        jrome.navigateToURL("www.facebook.com/page1");
        System.out.println("Current Url : "+jrome.getCurrentUrl());
        jrome.navigateBackwards();
        System.out.println("Current Url : "+jrome.getCurrentUrl());
        jrome.navigateForwards();
        System.out.println("Current Url : "+jrome.getCurrentUrl());
    }
}
