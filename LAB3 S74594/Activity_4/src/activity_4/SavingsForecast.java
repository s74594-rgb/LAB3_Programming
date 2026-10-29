/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activity_4;

import java.util.Scanner;

public class SavingsForecast {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("*************************");
        System.out.println("MY SAVING FORECAST PROGRAM");
        System.out.println("*************************");

        System.out.print("WHAT IS THE VALUE YOU WANT TO HAVE IN YOUR ACCOUNT? RM ");
        double futureValue = input.nextDouble();

        System.out.print("HOW MANY YEARS YOU WANT THE MONEY TO SIT IN YOUR ACCOUNT? ");
        int years = input.nextInt();

        System.out.print("WHAT IS THE ANNUAL INTEREST RATE (IN %)? ");
        double annualInterestRate = input.nextDouble();

        double r = annualInterestRate / 100.0;
        double presentValue = futureValue / Math.pow((1 + r), years);

        System.out.println("\nTHE AMOUNT YOU NEED TO DEPOSIT TODAY IS RM " + presentValue);

        input.close();
    }
}