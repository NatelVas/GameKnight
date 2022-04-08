package com.company;

public class Thing {

    public double force;
    public int energy;
    public int price;

    public Thing (double force, int energy, int price) {

        this.price = price;
        this.force = force;
        this.energy = energy;
    }
    @Override
    public String toString () {
        return " Добавит силы:  " + force + ", Добавит энергии: " + energy + ", Его стоимость: " + price;
    }
}
