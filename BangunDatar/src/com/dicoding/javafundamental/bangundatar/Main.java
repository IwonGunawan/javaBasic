package com.dicoding.javafundamental.bangundatar;

import java.util.Scanner;

public class Main {

    private static char pilihan;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        PersegiPanjang persegiPanjang;
        SegittigaSiku segittigaSiku;
        Lingkaran lingkaran;
        int s1, s2, r;

        persegiPanjang = new PersegiPanjang();
        segittigaSiku = new SegittigaSiku();
        lingkaran = new Lingkaran();

        // call mainMenu()
        mainMenu();

        switch (pilihan) {
            case '1' : {
                System.out.print("Masukan Panjang Persegi : ");
                s1 = scanner.nextInt();
                System.out.print("Masukan Lebar : ");
                s2 = scanner.nextInt();

                System.out.println("Luas Persegi Panjang = " + persegiPanjang.luas(s1, s2));
                System.out.println("Keliling Persegi Panjang = " + persegiPanjang.keliling(s1, s2));
                break;
            }
            case '2' : {
                System.out.print("Masukan Panjang Segitiga : ");
                s1 = scanner.nextInt();
                System.out.print("Masukan Lebar Segitiga : ");
                s2 = scanner.nextInt();

                System.out.println("Luas Segitiga : " + segittigaSiku.luas(s1, s2));
                System.out.println("Keliling Segitiga : " + segittigaSiku.keliling(s1, s2));
                break;
            }
            case '3' : {
                System.out.print("Masukan Jari-jari Lingkaran : ");
                r = scanner.nextInt();

                System.out.println("Luas Lingkaran : " + lingkaran.luas(r));
                System.out.println("Keliling Lingkaran : " + lingkaran.keliling(r));
                break;
            }
            default: {
                System.out.println("Tidak ada pilihan");
                break;
            }
        }
    }

    public static void mainMenu() {
        System.out.println("==============");
        System.out.println("Hitung Luas dan Keliling");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Segitiga Siku-siku");
        System.out.println("3. Lingkaran");
        System.out.println("Masukan Menu : ");
        pilihan = scanner.next().charAt(0);
    }
}
