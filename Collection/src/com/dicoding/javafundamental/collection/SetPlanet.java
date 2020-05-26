package com.dicoding.javafundamental.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPlanet {
    public static void main(String[] args) {

        Set<String> planet = new HashSet<>();
        planet.add("mercury");
        planet.add("venus");
        planet.add("earth");
        planet.add("mars");
        planet.add("earth");

//        planet.remove("venus");
//        for (String planett : planet) {
//            System.out.println(planett);
//        }
        System.out.println("size is " + planet.size());
        for (Iterator iterator = planet.iterator(); iterator.hasNext(); ) {
            System.out.println(iterator.next());
        }
    }
}
