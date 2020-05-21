package com.dicoding.javafundamental.operator;

public class OperatorUnary {
    public static void main(String[] args) {

        System.out.println("Operator Unary Plus");
        int nilaiAwal = 5;
        int hasil = +nilaiAwal;
        System.out.println("hasil 5 = " + hasil);
        System.out.println();

        System.out.println("Operator Unary Negative");
        int nilaiAwal2 = 5;
        int hasil2 = -nilaiAwal2;
        System.out.println("hasil 5 = " + hasil2);
        System.out.println();

        System.out.println("Operator Peningkatan 1 point");
        int nilaiAwal3 = 5;
        nilaiAwal3++;
        System.out.println("hasil 5 = " + nilaiAwal3);
        System.out.println();

        System.out.println("Operator Pengurangan 1 point");
        int nilaiAwal4 = 5;
        nilaiAwal4--;
        System.out.println("hasil 5 = " + nilaiAwal4);
        System.out.println();

        System.out.println("Operator Komplemen Logika");
        Boolean nilaiAwal5 = true;
        boolean hasil5 = !nilaiAwal5;
        System.out.println("komplemen true = " + hasil5);
        System.out.println();
    }
}
