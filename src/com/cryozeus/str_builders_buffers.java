package com.cryozeus;

public class str_builders_buffers {

    public static void main(String[] args) {

        /*If we are going to make many string changes,
        * we may want to use a 'string builder'
        *
        * A 'String Buffer' on the other hand, is used whenever you are using threads
        *
        * In case of threads, just replace 'StringBuilder' below with 'StringBuffer*/

        StringBuilder sb = new
                StringBuilder("I'm a string Builder haha!");
        /*Getting length, size and everything else we could get with strings : */
        System.out.println(sb.length());
        //Getting size :
        System.out.println(sb.capacity());
        //Appending a primitive or a string to a String Builder :
        sb.append(" YEAH!");
        //inserting at a specific index :
        System.out.println(sb.insert(6, "Big "));
        //Replacing at a specific index :
        System.out.println(sb.replace(6,9, "wig"));
        //Extracting substrings :
        System.out.println(sb.substring(6, 10));
        //Delete substring :
        System.out.println(sb.delete(6, 10));
        //Getting char at a specific index :
        System.out.println(sb.charAt(4));
        //Getting index for the string we type :
        System.out.println(sb.indexOf("Yeah"));




    }

}
