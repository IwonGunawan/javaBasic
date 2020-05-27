package com.dicoding.javafundamental.generics;

public class Planet {

    private String name;
    private double mess;

    public Planet(String name, double mess) {
        this.name = name;
        this.mess = mess;
    }

    public void print() {
        System.out.println("planet " + name + ", mess " + mess);
    }
}
