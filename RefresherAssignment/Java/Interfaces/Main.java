package com.darkRealm;

public class Main {

    public static void main(String[] args) {
        // write your code here
        BinarySearchTreeGeneric<CustomTreeElement> bst = new BinarySearchTreeGeneric<>();
        ITreeElement arr[] = new CustomTreeElement[]{
                new CustomTreeElement(100),
                new CustomTreeElement(75),
                new CustomTreeElement(125),
                new CustomTreeElement(50),
                new CustomTreeElement(90),
                new CustomTreeElement(25),
                new CustomTreeElement(110),
                new CustomTreeElement(104),
                new CustomTreeElement(111),
                new CustomTreeElement(105),
                new CustomTreeElement(102),
                new CustomTreeElement(150),
                new CustomTreeElement(135),
                new CustomTreeElement(103)
        };

        for (int i = 0; i < arr.length; i++) {
            bst.insert(arr[i]);
        }

        bst.printInorder();

        bst.delete(arr[2]);
        System.out.println("\nAfter 125 delete");
        bst.printInorder();
    }
}
