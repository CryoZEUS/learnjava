package com.cryozeus;

import java.util.Scanner;

public class Casting {

    static Scanner sc = new Scanner(System.in);



    public static void main(String[] args) {
        //casting - converting data types.
        /*converting from smaller to larger data types is automatically allowed.
        * however converting larger to smaller data types is done differently : */
        int smInt = 10;
        long smLong = smInt;

        //whatever you want to convert it into, put it in a paranthesis like '(int)'
        double cdbl = 1.234;
        int cint = (int) cdbl;
        System.out.println(cint);

    }
}
