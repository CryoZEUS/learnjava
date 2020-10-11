package com.cryozeus;

public class conditionals {

    //Some different ways of Handling Conditionals are given here:


    public static void main(String[] args) {

        //METHOD 1

        //Relational Operators : == != > < >- <=
        //Logical Operators : ! (not) && (and) || (or)

        int age = 12;
        if((age >= 5) && (age <=6)){
            System.out.println("Go to Kindergarten! ");
        } else if ((age >= 7) && (age <=13)){
            System.out.println("Go to Middle School! ");
        } else if ((age >= 14) && (age <=17)){
            System.out.println("Go to High School! ");
        } else if ((age >= 17) && (age <=21)){
            System.out.println("Go to College! ");
        } else {
            System.out.println("Stay Home.");
        }

        System.out.println("true || false = " + (true || false));
        System.out.println("!true = " + (!true));

        //METHOD 2

        //ternary operator - returns first value if condition os tru and second value if it is not.
        boolean canVote = (age >= 18) ? true : false;
        System.out.println("can Vote : " + canVote);

        //METHOD 3

        //Using switch statement when options are limited:
        String lang = "France";
        switch(lang) {
            case "Chile" : case "Cuba" :
                System.out.println("Hola! ");
                break;
            case "France" :
                System.out.println("Bonjour! ");
                break;
            case "Japan" :
                System.out.println("Konichiwa! ");
                break;
            default:
                System.out.println("Hello");
        }

    }
}
