package com.dicoding.javafundamental.obyek;

public class CallFunction {
    public static void main(String[] args) {

        double panjang = 5;
        double lebar = 3;

        double luas = luasPersegi(panjang, lebar);
        System.out.println(luas);
    }

    public static double luasPersegi(double panjang, double lebar) {
        double result = panjang * lebar;

        return result;
    }
}
