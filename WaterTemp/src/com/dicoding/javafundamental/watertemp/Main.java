package com.dicoding.javafundamental.watertemp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int T;

        System.out.println("Water Temperatur App");
        System.out.println("========================");
        System.out.println();

        System.out.print("Suhu (c) = ");
        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt();

        if (T <= 0) {
            System.out.println("Suhu air Beku " + T);
        }
        else if ((T > 0) && (T <= 100)) {
            System.out.println("Suhu air Cair " + T);
        }
        else if (T > 100) {
            System.out.println("Suhu air GAS " + T);
        }
    }
}
