package com.dicoding.javafundamental;

public class While {
    public static void main(String[] args) {

        int i = 1;
        while (i <= 5)
        {
            System.out.println(i);
            i++;
        }

        int x = 1;
        do {
            System.out.println("do while " + x);
            x++;
        }while (x <= 10);
    }
}
