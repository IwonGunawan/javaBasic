package com.dicoding.javafundamental.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class WildCard {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("object string 1");
        list.add("object string 2");

        printList(list);

        Collection<Planet> collection = new ArrayList();
        collection.add(new Planet("mars", 0.45));
        collection.add(new Planet("pluto", 3.5));

        printCollection(collection);
    }

    private static void printList(Collection<?> collection) {
        for (Object o : collection) {
            System.out.println(o);
        }
    }

    private static void printCollection(Collection<?> collection) {
        for (Object o : collection) {
            Planet p = (Planet) o;
            p.print();
        }
    }
}
