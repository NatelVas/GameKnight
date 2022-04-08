package com.company;

public class Knight {

    public String name;
    public int energy;
    public double force;
    public int money;

    public Knight (String name, int energy, double force, int money) {
        this.name = name;
        this.energy = energy;
        this.force = force;
        this.money = money;
            }
    @Override
    public String toString () {
        return "Ваша Энергия: " + energy +
                "\nВаша Сила:  " + force
                + "\nВаши монеты: " + money;
    }

}
