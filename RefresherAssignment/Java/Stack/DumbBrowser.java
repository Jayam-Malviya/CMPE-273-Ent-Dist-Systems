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
