package com.dicoding.javafundamental.obyek;

public class Main {
    public static void main(String[] args) {

        Hewan elang = new Hewan("Elang");
        Hewan gajah = new Hewan("Gajah");

        elang.setBerat(5);
        elang.setJumlahKaki(2);
        gajah.setBerat(100);
        gajah.setJumlahKaki(4);

        elang.cetakNama();
        gajah.cetakNama();
    }
}
