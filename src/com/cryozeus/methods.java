package com.cryozeus;

public class methods {

    //creating methods outside the main function:

    /*public methods are accessible by all classes
     * private methods are accessible only within that class
     * protected methods are accessible within that class and sub-classes */

    public static int getSum(int x, int y) {
        return x + y;
    }
    
    public static void changeMe(int cNum) {
        cNum = 10;
    }

    public static int getSum2(int ... nums) {
        //receives an unknown number of integers
        int sum = 0;
        for(int x: nums) {
            sum += x;
        }
        return sum;
    }

    static int[] getNext2(int x) {
        int [] vals = new int[2];
        vals[0] = x + 1;
        vals[1] = x + 2;
        return vals;
    }

    /*public static List<Object> getRandList() {
        String name = "Keanu";
        int age = 51;
        return Arrays.asList(name, age);
    }*/

    //RECURSIVE method / function.
    /*When we call a recursive function that calls itself,
    We need to have a condition where it won't call itself anymore*/

    static int factorial(int num){
        if(num == 1){
            return 1;
        }
        else {
            int result  = num * factorial(num - 1);
            return result;
        }

    }

    static int getSum3(int[] nums){
        int sum = 0;
        for(int x: nums) sum+=x;
        return sum;
    }

    public static void main(String[] args) {

        System.out.println("5 + 4 = " + getSum(5,4));

        int cNum = 0;
        changeMe(cNum);
        System.out.println("cNum = " + cNum);
        //Note that even though changeMe was applied to cNum, the value remains the same.
        //This is because cNum in both Methods, changeMe and main are different variables and cease to exist as soon as we leave the method.


        System.out.println("Sum : " + getSum2(1,2,3,3,4,54,4));

        int[]  multVA = getNext2(5);
        for(int x: multVA) System.out.println(x);


        //getting multiple values of  different types :
        /*Create a list using Object
        * Everything inside Java comes from the Object, 'Object' or class 'Object'*/

        /*List<Object> randList = getRandList();
        System.out.println(randList);
        */


        //recursion :
        System.out.println("Factorial 4 (4!) = " + factorial(4));


        //passing an array into a method :
        int[] nums = {1,2,3};
        System.out.println("Sum = " + getSum3(nums));

    }

}
