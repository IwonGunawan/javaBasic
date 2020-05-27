package com.dicoding.javafundamental.exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        // try-catch
        try {
            String location = "D://name2.txt";
            File file = new File(location);
            FileReader fileReader = new FileReader(file);

            System.out.println("file berhasil dibaca");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // try-catch-finlly
        int[] a = new int[5];

        try {
            System.out.println("index ke 5 adalah " + a[5]);

        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("error :" + e);

        }finally {
            a[4] = 10;
            System.out.println("index ke 4 " + a[4]);
        }
    }
}
