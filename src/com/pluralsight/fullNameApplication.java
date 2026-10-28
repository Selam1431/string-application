package com.pluralsight;
import java.util.Scanner;

public class fullNameApplication {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ENter Your first name: ");
        String firstName = scanner.nextLine().trim();

        System.out.print("Enter Your Middle Name: ");

        String middleName = scanner.nextLine().trim();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine().trim();

        System.out.print("Enter you suffix: ");
        String suffix = scanner.nextLine().trim();

        String fullName = firstName;

        if (!middleName.isEmpty()) {
            fullName += ", " + middleName;

        }
        fullName += ", " + lastName;

        if (!suffix.isEmpty()){
            fullName += ", " + suffix;
        }

        System.out.print("Full name: " + fullName);

        scanner.close();




    }
}
