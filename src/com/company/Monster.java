package com.company;

public class Monster {

    public int money;
    public int energy;
    public double force;

    public Monster (int money, int energy, double force) {
        this.money = money;
        this.energy = energy;
        this.force = force;

    }
    @Override
    public String toString () {
        return " За него награда: " + money + ", Его сила:  " + force + ", Вам потребуется энергия: " + energy;}
}
