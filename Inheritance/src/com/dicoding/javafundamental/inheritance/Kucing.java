package com.dicoding.javafundamental.inheritance;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Kucing extends Hewan {

    private String ras;
    private String habitat;

    public Kucing(String ras, String habitat) {
        this.ras = ras;
        this.habitat = habitat;
    }

    public String toString() {
        return "Kucing ras " + ras + " pada habitat " + habitat;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Kucing) {
            Kucing other = (Kucing) obj;
            return this.habitat.equals(other.habitat);
        }else {
            return false;
        }
    }

    public Kucing() {
        //super();
        System.out.println("construct kucing ");
    }

    void makan() { // overriding
        System.out.println("kucing makan");
    }

    void makan(String food) { // overloading
        System.out.println("kucing makan " + food);
    }
}
