package com.dicoding.javafundamental.collection;

import java.sql.Struct;
import java.util.HashMap;
import java.util.Map;

public class MapPlanet {
    public static void main(String[] args) {

        // menggunakan hashmap
        Map<String, Planet> planetMap = new HashMap<>();
        planetMap.put("key-1", new Planet("mercury", 0.06));
        planetMap.put("key-2", new Planet("Venus", 0.82));
        planetMap.put("key-3", new Planet("Earth", 1.00));
        planetMap.put("key-4", new Planet("Mars", 0.11));
        planetMap.put("key-4", new Planet("Mars-x", 0.11));

        System.out.println("size " +planetMap.size());
        for (String key : planetMap.keySet()) {
            System.out.println("key is " + key + " with value " + planetMap.get(key));
        }

        for (Planet planet : planetMap.values()) {
            System.out.println(planet);
        }
    }
}
