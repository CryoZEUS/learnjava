package com.cryozeus;

import java.util.Arrays;
import java.util.stream.IntStream;

public class arrays {

    public static void main(String[] args) {

        /*Arrays are just boxes of memory that allow you to assign names to multiple values*/
        //Setting aside 10 spaces for our numbers :
        int[] a1 = new int[10];
        a1[0] = 1;
        //filling the value '2' in all the spots :
        Arrays.fill(a1, 2);
        //Getting values :
        System.out.println(a1[0]);
        //Getting array size :
        System.out.println(a1.length);
        //Creating a string array and adding values simultaneously :
        String[] a2 = {"one", "two"};
        //Generating an array :
        /*IntStream is discussed later.
        * also, rangeClosed has the latter value included.*/
        int[] oneTo10 = IntStream.rangeClosed(1,10).toArray();

        /*since the following is a single line statement, we don't need curly brackets.*/
        for(int x: oneTo10) System.out.println(x);

        //Finding values :
        /*outputs the index at which the value is found.*/
        System.out.println(Arrays.binarySearch(oneTo10, 9));

        //Creating multi-dimensional arrays :
        int a3[][] = new int[2][2];
        /*We can create and initialize at the same time.*/
        String[][] a4 = {{"00", "10"},
                         {"01", "11"}};
        System.out.println(a4[1][1]);

        //3D Array :
        String a5[][][] = {{{"000"}, {"100"}, {"200"}, {"300"}},
                            {{"010"}, {"110"}, {"210"}, {"310"}},
                            {{"020"}, {"120"}, {"220"}, {"320"}}};

        System.out.println(a5[2][3][0]);

        //Copying one array into another :
        int a6[] = {1, 2, 3};
        int a7[] = Arrays.copyOf(a6, 3);    //3 = num of vlaues you wanna copy
        //Compare a6 with a7
        System.out.println(Arrays.equals(a6, a7));

        //Sorting arrays :
        int a8[] = {3, 2, 1};
        Arrays.sort(a8);
        /*convert the array into a string we can output : */
        System.out.println(Arrays.toString(a8));










    }
}
