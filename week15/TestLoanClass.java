package com.HJK.hello;

import java.util.Scanner;
import java.text.SimpleDateFormat; // Import SimpleDateFormat to format the date

public class TestLoanClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter annual interest rate, for example, 8.25: ");
        double annualInterestRate = input.nextDouble();

        System.out.println("Enter number of years as an integer: ");
        int numberOfYears = input.nextInt();

        System.out.println("Enter loan amount, for example, 120000.95: ");
        double loanAmount = input.nextDouble();
        input.close();

        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

        // Create a SimpleDateFormat object to format the date
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String loanDateFormatted = dateFormat.format(loan.getLoanDate());

        // Use the formatted date string in the print statement
        System.out.printf("The loan was created on %s%nThe monthly payment is %.2f%nThe total payment is %.2f%n",
                loanDateFormatted, loan.getMonthlyPayment(), loan.getTotalPayment());
    }
}