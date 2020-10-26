package com.cryozeus;

//This is basically a utility class; so it makes sense to have all methods inside it as static.
public class Battle {

    public static void startFight(Warrior w1, Warrior w2) throws InterruptedException {
        while(true) {
            //loop while giving each character a chance to attack and then block.
            if (getAttackResult(w1, w2).equals("Game Over")) {
                System.out.println("Game Over");
                break;
            }
            if (getAttackResult(w2, w1).equals("Game Over")) {
                System.out.println("Game Over");
                break;
            }


        }
    }

    public static String getAttackResult(Warrior wA, Warrior wB) throws InterruptedException {
        /*The variables represent :
        * wA - Warrior attacking
        * wB - Warrior blocking*/
        int wAAttkAmt = wA.attack();
        int wBBlockAmt = wB.block();

        int dmg2WarB = wAAttkAmt - wBBlockAmt;
        if(dmg2WarB > 0) {
            wB.health -= dmg2WarB;
        } else dmg2WarB = 0;

        System.out.printf("%s Attacks %s and deals " +
                "%d damage\n", wA.getName(), wB.getName(), dmg2WarB);

        /* NOTE - 'printf' is for formatted output
        * %s : Strings
        * %d : integers
        * %f : Floats / Decimals
        * %.2f : to limit to 2 decimals
        * %c : Characters
        * %e : Scientific Notation
        * %t : Dates
        * %b : Booleans*/

        System.out.printf("%s Has %d Health\n\n",
                wB.getName(), wB.health);

        //Pausing output for 1500ms using Threads :
        Thread.sleep(1500);

        if(wB.health  <= 0) {
            System.out.printf("%s has Died and %s Wins!\n", wB.getName(), wA.getName());
            return "Game Over";
        } else return "Fight Again";


    }

}
