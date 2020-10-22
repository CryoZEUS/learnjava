package com.cryozeus;

public class enumerated_types {

    //we can created custom types with limited number of options :

    public enum Day {Monday, Tuesday, Wednesday};

    public static void main(String[] args){

        Day favDay = Day.Monday;
        System.out.println("Favourite day is " + favDay);

    }

}
