package com.dicoding.javafundamental.obyek;

public class Hewan {

    String nama;
    int berat;
    int jumlahKaki;

    public Hewan(String namaHewan) {
        nama = namaHewan;
    }

    public void setBerat(int beratHewan) {
        berat = beratHewan;
    }

    public void setJumlahKaki(int kakiHewan) {
        jumlahKaki = kakiHewan;
    }


    public void cetakNama() {
        System.out.println("Nama Hewan = " + nama);
        System.out.println("Berat Hewan = " + berat + " Kg");
        System.out.println("Jumlah Kaki = " + jumlahKaki);
    }

    public int hello() {
        int alo = berat;
        return alo;
    }
}
