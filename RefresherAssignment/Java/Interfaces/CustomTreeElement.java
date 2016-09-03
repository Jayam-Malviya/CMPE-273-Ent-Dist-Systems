package com.darkRealm;

/**
 * Created by Jayam on 8/21/2016.
 */
public class CustomTreeElement implements ITreeElement {
    CustomTreeElement _left;
    CustomTreeElement _right;
    int _data;

    public int get_data() {
        return _data;
    }

    public CustomTreeElement(int d) {
        _data = d;
    }

    @Override
    public ITreeElement getRight() {
        return _right;
    }

    @Override
    public ITreeElement getLeft() {
        return _left;
    }

    @Override
    public void setRight(ITreeElement e) {
        _right = (CustomTreeElement) e;
    }

    @Override
    public void setLeft(ITreeElement e) {
        _left = (CustomTreeElement) e;
    }

    @Override
    public int getData() {
        return _data;
    }

    @Override
    public void setData(int data) {
        _data = data;
    }

    @Override
    public boolean isLeaf() {
        return getLeft() == null && getRight() == null;
    }
}
