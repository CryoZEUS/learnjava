package com.cryozeus;

import java.util.Random;

//This is a sub-class of Warrior.

//Getting all the attributes of Warrior  :

public class DodgeWarrior extends  Warrior{

    //Chance that Loki will be able to dodge from Thor
    double dodgePercent;
    Random rand = new Random();

    public DodgeWarrior(String name, int health,
                        int attkMax, int blockMax,
                        double dodgePercent) {
        //call the superclass - Warrior
        super(name, health, attkMax, blockMax);
        //handling things that are NOT in Warrior Class :
        this.dodgePercent = dodgePercent;

        //Composition :
        teleportType = new CanTeleport();

    }

    //Using this file / subclass to change things in the superclass i.e Warrior :
    //This is going to overwrite whatever is inside the public class Warrior.
    public int block() {
        double chance = rand.nextDouble();
        if(chance <= dodgePercent) {
            System.out.printf("%s Dodged the Attack\n\n", this.getName());
                    return 10000;
            //returned 10000 because that ensures that no matterhow high, the attack doesn't damage our Warrior who blocks

        } else {
            return 1 + (int)(Math.random() * ((blockMax - 1) + 1));
        }
    }


}
