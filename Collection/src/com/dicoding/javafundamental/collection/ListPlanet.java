package com.dicoding.javafundamental.collection;

import java.util.ArrayList;
import java.util.List;

public class ListPlanet {
    public static void main(String[] args) {

        // deklarasi array
        String[] heroes = new String[2];
        heroes[0] = "riki";
        heroes[1] = "seven"; // terbatas

        // arrayList
        List<String> planet = new ArrayList<>();
        planet.add("mercury");
        planet.add("venus");
        planet.add("earth");
        planet.add("earth");
        planet.add("mars"); // unlimited

        System.out.println("======== Heroes ========");
        for (int i=0; i < heroes.length; i++) {
            System.out.println(heroes[i]);
        }

        planet.remove("mars");
        System.out.println("======== Planets ========");
        for (int i=0; i < planet.size(); i++) {
            System.out.println(planet.get(i));
        }
    }
}
