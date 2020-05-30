package com.dicoding.javafundamental.vokalkonsonan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String S;

        System.out.println("Vokal Konsonan App");
        System.out.println("========================");
        System.out.println();

        System.out.print("Input String : ");
        Scanner scanner = new Scanner(System.in);
        S = scanner.nextLine();

        int num_vokal = numVokal(S);
        int num_konsonan = numKonsonan(S);

        System.out.println("Total Huruf Vokal = " + num_vokal);
        System.out.println("Total Huruf Konsonan = " + num_konsonan);
    }

    private static int numVokal(String word) {
        int result = 0;

        for (int i=0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'i' || word.charAt(i) == 'u' ||
                    word.charAt(i) == 'e' || word.charAt(i) == 'o') {
                result++;
            }
        }

        return result;
    }

    private static int numKonsonan(String word) {
        int result = 0;

        for (int i=0; i < word.length(); i++) {
            if (word.charAt(i) != 'a' && word.charAt(i) != 'i' && word.charAt(i) != 'u' &&
                    word.charAt(i) != 'e' && word.charAt(i) != 'o') {
                result++;
            }
        }

        return result;
    }


}
