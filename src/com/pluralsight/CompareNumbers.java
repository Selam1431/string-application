package com.pluralsight;

public class CompareNumbers {
    static void main(String[] args){
        System.out.println(isEven(5));
        System.out.println(isEven(8));

        System.out.println(isOdd(5));
        System.out.println(isOdd(8));



    }
    public static boolean isEven(int number) {
        return number % 2 == 0;



    }

    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }


}
