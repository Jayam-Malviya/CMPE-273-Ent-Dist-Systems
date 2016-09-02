package com.darkRealm;

import java.util.Stack;

/**
 * Created by Jayam on 9/2/2016.
 */
public class DumbBrowser {
    Stack _backStack;
    Stack _forwardStack;
    String _currentURL;
    String _homeURL;


    public DumbBrowser(String homePage) {
        _backStack = new Stack<String>();
        _forwardStack = new Stack<String>();
        _homeURL = _currentURL = homePage;
    }

    public void navigateToURL(String url) {
        _backStack.push(_currentURL);
        _currentURL = url;
    }

    public void navigateToNewURL(String newUrl) {
        _backStack.push(_currentURL);
        _currentURL = newUrl;
        _forwardStack.removeAllElements();
    }

    public void navigateBackwards() {
        if (!_backStack.isEmpty()) {
            _forwardStack.push(_currentURL);
            _currentURL = (String) _backStack.pop();
        }
    }

    public void navigateForwards() {
        if (!_forwardStack.isEmpty()) {
            _backStack.push(_currentURL);
            _currentURL = (String) _forwardStack.pop();
        }
    }

    public String getCurrentUrl() {
        return _currentURL;
    }

    public String peekForwardUrl() {
        return _forwardStack.isEmpty() ? "" : (String) _forwardStack.peek();
    }

    public String peekBackwwardUrl() {
        return _backStack.isEmpty() ? "" : (String) _backStack.peek();
    }
}


/*
* So Lets use Stack, Back Stack and Forward Stack.

When stack is empty, disable the button.

When you navigate to new Url, push url on Back Stack. Clear Forward Stack, this is the complicated step in case of Linked List or any other implementation.

When you hit the back button, pop the top Url from Back Stack, push it in Forward Stack.

When you hit the forward button, pop the top Url from Forward Stack and push it on to Back Stack.

This logic can also be used for Undo / Redo functionality.
* */