package com.dicoding.javafundamental.basic;

import com.dicoding.javafundamental.basic.kendaraan.Kereta;
import com.dicoding.javafundamental.basic.kendaraan.Mobil;
import com.dicoding.javafundamental.basic.kendaraan.Motor;
import com.dicoding.javafundamental.basic.musik.Gitar;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("this struktur dasar !");
        // percobaan tentang memanggil class beda pacakge
        Gitar.bunyi();

        // percobaan tentang wildcard(*) pada import.
        Motor.jumlahBan();
        Mobil.jumlahBan();
        Kereta.jumlahBan();

        // percobaan tentang memanggil class pada lib/jar lain
        Date today = new Date();
        System.out.println("Hari ini = " + today);
        Date tomorrow = DateUtils.addDays(today, 1);
        System.out.println("Besok = " + tomorrow);


    }
}
