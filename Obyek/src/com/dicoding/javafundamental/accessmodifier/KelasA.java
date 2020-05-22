package com.dicoding.javafundamental.accessmodifier;

public class KelasA {

    private int memberA = 5;

    private int functionA() {
        return memberA;
    }

    int functionB() {
        int result = functionA() + memberA;
        return result;
    }

    protected String methodC() {
        String txt = "ini adalah text dari package accessmodifier.methodC()";
        return txt;
    }
}
