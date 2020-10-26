package com.cryozeus;

public class WarriorGame {

    public static void main(String[] args) throws InterruptedException {

        Warrior thor = new Warrior("Thor", 800, 130, 40);
        Warrior loki = new Warrior("Loki", 800, 90, 70);
        Battle.startFight(thor, loki);
    }
}
