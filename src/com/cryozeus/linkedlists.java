package com.cryozeus;

import java.util.Arrays;
import java.util.LinkedList;

public class linkedlists {

    public static void main(String[] args) {

        //Linked Lists
        /*These are best used when you have to make multiple changes in the MIDDLE of your list
        * Each item in the list / link only has a reference ot the value before and the value after it*/

        LinkedList<Integer> iL1 = new LinkedList<Integer>();
        //Adding items :
        iL1.add(1); iL1.add(2); iL1.add(3);
        //Adding a list of items :
        iL1.addAll(Arrays.asList(1,2,3,4));
        //Adding to front :
        iL1.addFirst(0);
        //Adding to the end :
        iL1.addLast(53);
        //Checking if a value is inside a list :
        System.out.println(iL1.contains(4));
        //Getting an index for the match :
        System.out.println(iL1.indexOf(4));
        //replacing values :
        iL1.set(0,2);
        System.out.println(iL1.get(0));
        //Remove items :
        iL1.remove(1);
        //Clear

        //Getting number of items inside :
        System.out.println(iL1.size());
        //Convert it to an array :
        Object[] a9 = iL1.toArray();
        for(Integer x: iL1) System.out.println(x);




    }
}
