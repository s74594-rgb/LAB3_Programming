/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activity_2;

import java.util.Scanner;

public class CellPhoneOverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("*************************");
        System.out.println("MY CELL PHONE OVERAGE FEE");
        System.out.println("*************************");

        System.out.print("INSERT THE NUMBER OF EXCESS MINUTES: ");
        int excessMinutes = input.nextInt();

        double overageFee = excessMinutes * 0.35;

        System.out.println("OVERAGE FEE = RM " + overageFee);

        input.close();
    }
}