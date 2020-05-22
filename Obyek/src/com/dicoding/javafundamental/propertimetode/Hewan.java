package com.dicoding.javafundamental.propertimetode;

public class Hewan {

    // properti/atribut
    double tinggi;
    double berat;
    int umur;

    Hewan(double tinggi, double berat, int umur) {
        this.tinggi = tinggi;
        this.berat = berat;
        this.umur = umur;
    }

    double getTinggi() {
        return tinggi;
    }

    double getBerat() {
        return berat;
    }

    int getUmur() {
        return umur;
    }

}
