package com.company;

import java.util.Scanner;
import java.security.SecureRandom;
import java.security.Security;

public class Main {

    public static void main(String[] args) {

        System.out.println("Введите Ваше имя:");
        Scanner sc = new Scanner(System.in);
        String username = sc.next();

        System.out.println("Добро пожаловать в игру, " + username + ". Удачи!");
        System.out.println();

        Knight first = new Knight(username, 100, 20, 50);
        System.out.println(first);
        System.out.println();

        Monster EasyMonster = new Monster(5,20, 5);
        Monster MiddleMonster = new Monster( 20, 50, 10);
        Monster DifficultMonster = new Monster(40,100, 20);

        System.out.println("Вам предстоит сражение." +
                " \n Выберите сложность монстра:" +
                " \n 1 - Хилый монстрик." + EasyMonster +
                "\n 2 - Обычный монстр." + MiddleMonster +
                "\n 3 - Здоровый такой монстрище." + DifficultMonster);
        System.out.println();

        Thing Sword = new Thing(10, 0, 10);
        Thing Food = new Thing(0, 50,30);

        System.out.println("Выберите, что вам необходимо:" +
                " \n Выберите сложность монстра:" +
                " \n 1 - Меч." + Sword +
                "\n 2 - Зелье." + Food +
                "\n 3 - Спасибо. Ничего не надо)");




    }


}
