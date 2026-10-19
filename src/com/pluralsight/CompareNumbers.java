package com.pluralsight;

public class CompareNumbers {
    public static void main(String[] args){
        System.out.println(isEven(5));
        System.out.println(isEven(8));

        System.out.println(isOdd(5));
        System.out.println(isOdd(8));



    }
    public static boolean isEven(int number) {
        if(number % 2 == 0){
            return true;
        }
        else {
            return false;
        }



    }

    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }


}
