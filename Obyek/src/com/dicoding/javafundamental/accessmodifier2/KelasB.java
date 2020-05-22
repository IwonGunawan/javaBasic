package com.dicoding.javafundamental.accessmodifier2;

import com.dicoding.javafundamental.accessmodifier.KelasA;

public class KelasB extends KelasA {

    String callKelasA() {
        String txt = super.methodC();
        return txt;
    }
}
