package com.dicoding.javafundamental.obyek;

public class MethodOverloading {
    public static void main(String[] args) {

        double panjang  = 4.6;
        double lebar    = 5.3;
        double hasil    = luasPersegi(panjang, lebar);
        System.out.println("hasil(double) = " + hasil);

        int panjang2    = 5;
        int lebar2      = 7;
        int hasil2      = luasPersegi(panjang2, lebar2);
        System.out.println("hasil(int) = " + hasil2);
    }

    public static double luasPersegi(double panjang, double lebar) {
        double result = panjang * lebar;
        return result;
    }

    public static int luasPersegi(int panjang, int lebar) {
        int result = panjang * lebar;
        return result;
    }
}
