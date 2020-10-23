package com.cryozeus;

public class exception_handling {

    public static void main(String[] args) {

        //used to protect the code from errors that can crash the program.

        try {
            int badInt = 10/0;
        }

        //we can also deliberately throw certain exceptions like :
        /*
        try {

            throw new Exception("Bad Stuff right here lol.");
        }
        */

        //catches only arithmetic exception :
        catch(ArithmeticException ex) {
            //get a custom message for error in try block
            System.out.println("System can't divide by zero.");
            //get an automatic message for error in try block
            System.out.println(ex.getMessage());
            //printing automatic message in string format
            System.out.println(ex.toString() );
        }

        //catches all exceptions :
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }

        //cleaning up after the above code has been executed :
        finally {
            System.out.println("Clean Up");
        }

    }
}
