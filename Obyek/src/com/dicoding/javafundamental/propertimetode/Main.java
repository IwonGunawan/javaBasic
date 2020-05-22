package com.dicoding.javafundamental.propertimetode;

public class Main {
    public static void main(String[] args) {

        Hewan kucing = new Hewan(50.4, 70, 5);
        System.out.println("tinggi kucing = " + kucing.getTinggi());
        System.out.println("berat kucing = " + kucing.getBerat());
        System.out.println("umur kucing = " + kucing.getUmur());
    }
}
