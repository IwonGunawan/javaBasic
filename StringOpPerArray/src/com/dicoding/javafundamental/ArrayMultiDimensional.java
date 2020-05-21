package com.dicoding.javafundamental;

public class ArrayMultiDimensional {
    public static void main(String[] args) {
        char[][] arrChar = new char[2][];
        arrChar[0] = new char[2];
        arrChar[1] = new char[3];

        // array index-0
        arrChar[0][0] = 'a';
        arrChar[0][1] = 'b';

        // array index-1
        arrChar[1][0] = 'c';
        arrChar[1][1] = 'd';
        arrChar[1][2] = 'f';

        System.out.println(arrChar[1][2]);

    }
}
