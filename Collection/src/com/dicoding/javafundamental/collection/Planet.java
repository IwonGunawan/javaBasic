package com.dicoding.javafundamental.collection;

public class Planet {

    private String name;
    private double mass;

    public Planet(String name, double maas) {
        this.name = name;
        this.mass = maas;
    }

    public String toString() {
        String txt = "Planet " + name + " Mass " + mass;
        return txt;
    }
}
