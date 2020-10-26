package com.cryozeus;

public class WarriorGame {

    public static void main(String[] args) throws InterruptedException {

        Warrior thor = new Warrior("Thor", 800, 130, 40);
        //Making Loki a "DodgeWarrior" with a 25% chance of Blocking:
        Warrior loki = new DodgeWarrior("Loki", 800, 90, 70, 0.25);
        Battle.startFight(thor, loki);

        System.out.println("Loki " + loki.teleport());
        loki.setTeleportAbility(new CantTeleport());
        System.out.println("Loki " + loki.teleport());
    }
}
