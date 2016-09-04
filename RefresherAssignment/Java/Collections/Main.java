package com.darkRealm;

public class Main {

    public static void main(String[] args) {

        int[] studentsWhoGotAdmit = new int[]{11, 22, 33, 44, 55, 66, 77, 88, 99};
        int[] studentsWhoHaveCSBackground = new int[]{22, 44, 55, 88, 99};

        int[] studentsWithClassifiedStatus = Utility.calculateIntersection(studentsWhoGotAdmit,
                studentsWhoHaveCSBackground);
        System.out.println("Student IDS With Admit :");
        printArray(studentsWhoGotAdmit);

        System.out.println("Student IDS With CS background :");
        printArray(studentsWhoHaveCSBackground);

        System.out.println("Student IDS With Classified Status :");
        printArray(studentsWithClassifiedStatus);
    }

    public static void printArray(int[] arr){
        for (int i :
                arr) {
            System.out.print(" " + i);
        }
        System.out.println("");
    }
}
