package com.cryozeus;

import java.util.Scanner;

public class looping {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        //for loops :
        for(int i = 0; i < 5; i++){
            System.out.println(i);
        }

        //while lops (as long as the condition is true)
        int wL = 0;
        while(wL < 20){
            if(wL % 2 == 0){
                System.out.println(wL);
                wL++;
                continue;
                //contiue will help go back and continue executing
            }
            if(wL >= 10){
                break;
                //break to stop looping
            }
            wL++;
        }

        //do while loops

        int secretNum = 7;
        int guess = 0;
        do {
            System.out.print("Guess : ");
            if(sc.hasNextInt()){
                guess = sc.nextInt();

            }
        }while(secretNum != guess);
        System.out.println("You guessed it!");

    }
}
