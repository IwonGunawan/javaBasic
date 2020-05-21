package com.dicoding.javafundamental;

public class Stringg {
    public static void main(String[] args) {

        // Implode array character dengan java.lang.String
        char[] dicodingChar = {'i', 'w', 'o', 'n'};
        String dicodingString = new String(dicodingChar);
        System.out.println("hasilnya = " + dicodingString);

        // Mengetahui panjang string
        int length = dicodingString.length();
        System.out.println("panjang = " + length);

        // Mengambil Karakter dari string
        char result = dicodingString.charAt(0);
        System.out.println("char ke 0 = " + result);

        // isEmpty()
        String txt = "";
        if (txt.isEmpty()) {
            System.out.println("txt kosong");
        }
        else
        {
            System.out.println("txt tidak kosong");
        }

        // concat(String s)
        String string1 = "hallo disini";
        String concat = dicodingString.concat(string1);
        System.out.println("concat = " + concat);

        for (int x=0; x < 5; x++) {
            for (int i=0; i <= x; i++) {
                System.out.print("*");
            }
            System.out.println();
        }


        /* reference
        https://www.dicoding.com/academies/60/tutorials/1863?from=1803
        */
    }
}
