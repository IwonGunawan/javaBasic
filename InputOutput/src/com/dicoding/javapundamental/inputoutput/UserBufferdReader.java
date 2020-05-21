package com.dicoding.javapundamental.inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserBufferdReader {
    public static void main(String[] args) {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(isr);
        System.out.println("Input Output dengan BufferdReader");

        int value1 = 0;
        int value2 = 0;
        try {
            System.out.print("Masukan angka pertama :");
            value1 = Integer.parseInt(bufferedReader.readLine());
            System.out.print("Masukan angka kedua : ");
            value2 = Integer.parseInt(bufferedReader.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        }

        int hasil = value1 + value2;
        System.out.println("hasilnya = " + hasil);
    }
}
