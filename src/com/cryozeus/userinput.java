package com.cryozeus;

import javax.swing.*;
import java.util.Scanner;


public class userinput {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        /*Two different ways to get User Input : */

        //METHOD 1 : Using Scanner to get user input :
        System.out.print("Enter Name:  ");
        /*Choose DataType to be working with : */
        if(sc.hasNextLine()) {
            //Check for dataTypes like in this case, whichever user entered if it is a string input
            String userName =  sc.nextLine();
            System.out.println("Hello " + userName);

        }

        //METHOD 2 : Using Dialog Boxes to input information
        String jopName =
                JOptionPane.showInputDialog("Enter Name: ");
        System.out.println("Hello " + jopName);


    }
}
