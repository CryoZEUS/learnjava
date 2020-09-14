package com.cryozeus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class arraylists {

    public static void main(String[] args){

        /*Arraylists allow easy resize and insertion and deletion as compared to a regular array*/

        /*Type of Arraylist here = String, and we decide that initially the space allocated = 20*/
        ArrayList<String> aL1 = new ArrayList<String>(20);
        aL1.add("Sue");

        //Generating an ArrayList :
        ArrayList<Integer> aL2 = new ArrayList<>(Arrays.asList(1,2,3,4));

        /*using enhanced for loop to print out all values : */
        for(Integer x: aL2) System.out.print(x);
        //Note : all elements printed together because we used print instead of 'println' i.e printline.

        //Getting element at an index:
        System.out.println(aL2.get(1));
        //Adding values at an index:
        aL2.set(1,5);
        //removing values:
        aL2.remove(3);
        //clearing the entire array :
        /*  aL2.clear();   */

        //Iterators
        /*Allow us to cycle through collections of lists and arrays : */

        Iterator it = aL2.iterator();
        while(it.hasNext()) {
            //keeps on outputting values as long as there are values to output:
            System.out.println(it.next());
        }










    }
}
