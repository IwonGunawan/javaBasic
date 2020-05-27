package com.dicoding.javafundamental.iostream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in  = new FileInputStream("latihan_input.txt");
            out = new FileOutputStream("latihan_output.txt");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }

        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            try {
             if (in != null) {
                 in.close();
             }
             if (out != null) {
                 out.close();
             }

            }catch (IOException e) {
                e.printStackTrace();

            }

        }

        createDir();
        listDir();
    }

    public static void createDir() {
        String dirname = "folder/latihan 1";
        File file = new File(dirname);

        file.mkdirs();
    }

    public static void listDir() {
        String dirname = "folder";
        File file = null;
        String[] paths;

        try {
            // instansiasi object file
            file = new File(dirname);

            // ambil list file dan masukan ke string paths
            paths = file.list();

            // tampilkan path yang ada
            for (String path : paths) {
                System.out.println(path);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
