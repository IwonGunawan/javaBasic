package com.dicoding.javafundamental;

public class Array {
    public static void main(String[] args) {

        // Cara 1
        int[] arrInt = new int[]{1,2,3,4,5};
        System.out.println(arrInt[0]);
        System.out.println(arrInt[1]);
        System.out.println(arrInt[2]);
        System.out.println(arrInt[3]);
        System.out.println(arrInt[4]);

        // Cara 2
        int[] arrInt2 = new int[5];
        arrInt2[0] = 1;
        arrInt2[1] = 2;
        arrInt2[2] = 3;
        arrInt2[3] = 4;
        arrInt2[4] = 5;
        System.out.println(arrInt2[0]);
        System.out.println(arrInt2[1]);

        for (int x=0; x < 5; x++) {
            System.out.println("loopin array " + arrInt2[x]);
        }
    }
}
