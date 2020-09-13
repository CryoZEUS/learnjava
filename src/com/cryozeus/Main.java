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


        //casting - converting data types.
        /*converting from smaller to larger data types is automatically allowed.
         * however converting larger to smaller data types is done differently : */
        int smInt = 10;
        long smLong = smInt;

        //whatever you want to convert it into, put it in a paranthesis like '(int)'
        double cdbl = 1.234;
        int cint = (int) cdbl;
        System.out.println("\nDouble to int : " + cint);

        //'L' to represent a long. Just like F for float :
        long biglong = 2143242354455L;
        int bInt = (int) biglong;
        System.out.println("\nLong to int : " + bInt);

        //Convert to a string using a wrapper class :
        String favNum = Double.toString(1.618);
        //Byte.parseByte()
        int strInt = Integer.parseInt("10");
        System.out.println("Int from string : " + strInt);

        /*MATH FUNCTIONS :*/

        System.out.println(("abs(-7) = " + Math.abs(-7)));
        System.out.println(("ceil(4.257) = " + Math.ceil(4.257)));
        System.out.println(("floor(4.257) = " + Math.floor(4.257)));
        System.out.println(("round(4.257) = " + Math.round(4.257)));
        /*Similarly, there are other math functions like :
        * max, min, exp, log, log10, pow, sqrt, cbrt, hypot(5,5), Math.PI
        * Trigonometric functions :
        * sin, cos, tan, asin, acos, atan, sinh, cosh, tanh...
        * toDegrees, toRadians*/

        /*Some Other Math Libraries :
        * Colt, Jet, WEka, JScience, Mahout, Apache Commons Math*/


        //Generating Random Numbers :
        int minNum = 5;
        int maxNum = 20;
        int randNum = minNum + (int)(Math.random() * ((maxNum - minNum) + 1));

        System.out.println("Random Number b/w 5 aand 20 : " + randNum);


        //STRINGS : 'objects' or 'reference types'

        String name = "Derek";
        String wName = name + "O'Brien";
        wName += " is my name.";
        /*conversion is automatic : */
        String drsDog = "K" + 9;
        /*Getting a character at a position in a string using an index : */
        System.out.println("\nChar at index 1 : " + wName.charAt(1));

        //Searching through strings :
        /*Checking if a given string contains the string we are searching for*/
        System.out.println(wName.contains("Derek")); //Should be True
        //Getting index of that match :
        System.out.println(wName.indexOf("Derek"));
        /*Getting number of chars inside each string : */
        System.out.println(wName.length());

        //String comparison :
        /*Method 1 : */
        System.out.println("dog equals cat : " +
                ("dog".equals("cat")));
        /*Note : if you want to ignore upper/lower case of strings while comparing,
        * use 'equalsIgnoreCase' instead of 'equals' */

        /*Method 2 : */
        System.out.println(wName.compareTo("ABC")); /*if the result of this is zero, strings are the same.
        the value of -1 means the string comes before and anything positive means the string comes after.*/

        //Replacing any different matches :
        System.out.println(wName.replace("Derek", "Bob"));

        //Getting strings using indices :
        System.out.println(wName.substring(0,5));

        //Turning strings into arrays :
        /*using an enhanced for loop
        * converting string into array - using .split(" ")
        * splitting the regular expression based on spaces*/
        for(String x: wName.split(" ")) System.out.println(x);

        /*trim function deletes the whitespace at the beginning and th end of the string.
          trim toUpperCase and trim toLowerCase*/








    }
}
