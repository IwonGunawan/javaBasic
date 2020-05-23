package com.dicoding.javafundamental.inheritance;

public class Main {
    public static void main(String[] args) {

        Hewan hewan = new Hewan(); // memanggil constructor
        System.out.println("Apakah hewan IS-A Objek -> " + (hewan instanceof Object));
        System.out.println("Apakah hewan IS-A Hewan -> " + (hewan instanceof Hewan));
        System.out.println("Apakah hewan IS-A Kucing -> " + (hewan instanceof Kucing));

        System.out.println("------------------------");

        Kucing kucing = new Kucing(); // memanggil constructor
        System.out.println("Apakah kucing IS-A Objek -> " + (kucing instanceof Object));
        System.out.println("Apakah kucing IS-A Hewan -> " + (kucing instanceof Hewan));
        System.out.println("Apakah kucing IS-A Kucing -> " + (kucing instanceof Kucing));

        kucing.makan("ikan asin");

        System.out.println("------------------------");
        Kucing meow = new Kucing("ocicat", "tropis");
        Kucing puss = new Kucing("ocicat", "subtropis");
        Kucing popo = new Kucing("anggora", "subtropis");
        System.out.println(meow.toString());
        System.out.println(puss.toString());
        System.out.println(popo.toString());

        System.out.println("meow equals puss ? " + meow.equals(puss));
        System.out.println("meow equals popo ? " + meow.equals(popo));
        System.out.println("push equlas popo ? " + puss.equals(popo));

        String a1 = "hello";
        String a2 = "hello";
        System.out.println("" + a1 == a2);
    }
}
