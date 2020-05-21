package com.dicoding.javapundamental.inputoutput;

import java.util.Scanner;

public class InputOutputFunction {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Output dengan Scanner");
        System.out.print("Masukan angka pertama : ");
        int value1 = scanner.nextInt();
        System.out.print("Masukan angka kedua : ");
        int value2 = scanner.nextInt();
        int hasil = value1 + value2;

        System.out.println("Hasilnya adalah " + hasil);
    }
}
