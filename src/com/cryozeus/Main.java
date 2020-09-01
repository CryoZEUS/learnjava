package com.cryozeus;

//importing libraries :
import java.util.Scanner;


//Class where all of our code will reside (since we created a class) :
public class Main {

    //To recieve input from a user using a 'Scanner object' :
    static Scanner sc = new Scanner(System.in);
    //To get input from keyboard, we use system.in

    //Now creating a constant variable :
    final double SHORTPI = 3.14159;

    /*
     * Public - means that any piece of code will be able to access code inside public
     * static - means that any function that belongs to the class
     * some functions we create will be specific to the objects we create and others would be based off our class
     * void - means that this function doesn't return anything
     * String[] - means that if we run our program, it can recieve a string array and it would be stored inside this function.*/

    public static void main(String[] args) {
        //To output, use System.out and a print line :
        System.out.println("Hello World!");

        //create a variable :
        int var1 = 100;
        int v2, v3;

        /*DATA TYPES
        * Byte, short, char, boolean, int, float
        * double and long
        *
        * Each data type corresponds to the amount of space it reserves in memory.*/

        System.out.println("Byte Max : "+
                Byte.MAX_VALUE);
        System.out.println("Byte Min : "+
                Byte.MIN_VALUE);
        System.out.println("Short Max : "+
                Short.MAX_VALUE);
        System.out.println("Short Min : "+
                Short.MIN_VALUE);
        System.out.println("Char Max : "+
                Character.MAX_VALUE);
        System.out.println("Char Min : "+
                Character.MIN_VALUE);
        System.out.println("Int Max : "+
                Integer.MAX_VALUE);
        System.out.println("Int Min : "+
                Integer.MIN_VALUE);
        System.out.println("Float Max : "+
                Float.MAX_VALUE);
        System.out.println("Float Min : "+
                Float.MIN_VALUE);
        System.out.println("Double Max : "+
                Double.MAX_VALUE);
        System.out.println("Double Min : "+
                Double.MIN_VALUE);
        System.out.println("Long Max : "+
                Long.MAX_VALUE);
        System.out.println("Long Min : "+
                Long.MIN_VALUE);

        boolean happy = true;
        //characters can only store single characters :
        char a = 'a';
        float fnum = 1.111111111111111111111F;
        float fnum2 = 1.111111111111111111111F;
        //***NOTE : if you want it to be a float, end it with an upper case 'F'
        System.out.println("Float : " +
                (fnum + fnum2));

        /*Note : The precision in float operation stays only upto sixth decimal
        * For more precision, use a double : */

        double dbnum = 1.111111111111111111111;
        double dbnum2 = 1.111111111111111111111;
        System.out.println("Double : " +
                (dbnum + dbnum2));
        //Note : double has precision upto 15 decimal places.

        //Scientific Notation also works :
        double thousand = 1e+3;
        System.out.println(thousand);
        //You can use '_' for separation when dealing with large numbers for clarity
        long bigNum = 123_456_789;







    }
}
