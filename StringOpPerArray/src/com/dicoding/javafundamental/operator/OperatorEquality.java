package com.dicoding.javafundamental.operator;

public class OperatorEquality {
    public static void main(String[] args) {

        int value1 = 5;
        int value2 = 4;
        Boolean result;

        result = value1 == value2;
        System.out.println(value1 + " == " + value2 + " = " + result);

        result = value1 != value2;
        System.out.println(value1 + " != " + value2 + " = " + result);

        result = value1 > value2;
        System.out.println(value1 + " > " + value2 + " = " + result);

        result = value1 >= value2;
        System.out.println(value1 + " >= " + value2 + " = " + result);

        result = value1 < value2;
        System.out.println(value1 + " < " + value2 + " = " + result);

        result = value1 <= value2;
        System.out.println(value1 + " <= " + value2 + " = " + result);
    }
}
