
package com.pluralsight;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Mortgage Calculator");
        System.out.println("2. CD Calculator");
        System.out.println("3. Annuity Calculator");

        System.out.print("Choose a calculator: ");
        int choice = scanner.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter loan amount: ");
                double principal = scanner.nextDouble();

                System.out.print("Enter annual interest rate: ");
                double mortgageInterest = scanner.nextDouble();

                System.out.print("Enter loan length in years: ");
                int mortgageYears = scanner.nextInt();

                calculateMortgage(principal, mortgageInterest, mortgageYears);
                break;

            case 2:
                System.out.print("Enter deposit amount: ");
                double deposit = scanner.nextDouble();

                System.out.print("Enter annual interest rate: ");
                double cdInterest = scanner.nextDouble();

                System.out.print("Enter number of years: ");
                int cdYears = scanner.nextInt();

                calculateCD(deposit, cdInterest, cdYears);
                break;

            case 3:
                System.out.print("Enter monthly payout: ");
                double monthlyPayout = scanner.nextDouble();

                System.out.print("Enter annual interest rate: ");
                double annuityInterest = scanner.nextDouble();

                System.out.print("Enter number of years: ");
                int annuityYears = scanner.nextInt();

                calculateAnnuity(monthlyPayout, annuityInterest, annuityYears);
                break;

            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    // Calculator 1: Mortgage
    public static void calculateMortgage(
            double principal, double annualInterest, int years) {

        if (principal <= 0 || annualInterest < 0 || years <= 0) {
            System.out.println("Invalid input.");
            return;
        }

        int months = years * 12;
        double monthlyRate = annualInterest / 1200;

        double monthlyPayment;

        if (monthlyRate == 0) {
            monthlyPayment = principal / months;
        } else {
            double power = Math.pow(1 + monthlyRate, months);

            monthlyPayment = principal *
                    (monthlyRate * power) / (power - 1);
        }

        double totalInterest = (monthlyPayment * months) - principal;

        System.out.printf("Monthly Payment: $%.2f%nTotal Interest: $%.2f%n",
                monthlyPayment, totalInterest);
    }

    // Calculator 2: CD
    public static void calculateCD(
            double deposit, double annualInterest, int years) {

        if (deposit <= 0 || annualInterest < 0 || years <= 0) {
            System.out.println("Invalid input.");
            return;
        }

        double annualRate = annualInterest / 100;

        int numberOfDays = years * 365;

        double power = Math.pow(1 + annualRate / 365, numberOfDays);

        double futureValue = deposit * power;

        double totalInterest = futureValue - deposit;

        System.out.printf("Future Value: $%.2f%nTotal Interest Earned: $%.2f%n",
                futureValue, totalInterest);
    }

    // Calculator 3: Annuity
    public static void calculateAnnuity(
            double monthlyPayout, double annualInterest, int years) {

        if (monthlyPayout <= 0 || annualInterest < 0 || years <= 0) {
            System.out.println("Invalid input.");
            return;
        }

        int months = years * 12;

        double monthlyRate = annualInterest / 1200;

        double presentValue;

        if (monthlyRate == 0) {
            presentValue = monthlyPayout * months;
        } else {
            double power = Math.pow(1 + monthlyRate, -months);

            presentValue = monthlyPayout * (1 - power) / monthlyRate;
        }

        System.out.printf("Present Value: $%.2f%n", presentValue);
    }
}
