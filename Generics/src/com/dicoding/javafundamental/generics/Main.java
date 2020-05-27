package com.dicoding.javafundamental.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List lo = new ArrayList();
        lo.add("object string 1"); // akan error ketika di looping, karena bukan object planet
        lo.add(new Planet("mars", 0.11)); // object planet

        List<Planet> lp = new ArrayList<>();
//        lp.add("object string 2"); // error, karena bukan objek planet
        lp.add(new Planet("earth", 2.4));
        lp.add(new Planet("mercury", 0.55));

        for (Object o : lo) {
            Planet p = (Planet) o;
            p.print();
        }

        for (Planet p : lp) {
            p.print();
        }
    }
}
