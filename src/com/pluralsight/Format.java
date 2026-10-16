package com.pluralsight;

public class Format{
    public static void main(String[] args) {
        System.out.println(formatName("selam", " Mamuye"));

        String result = formatName("Kidus", "Assefa");
        System.out.println(result);





    }
    public static String formatName(String first, String last){
        return last + "," + first;



    }
}