package com.teclabs.assi;

import java.util.Scanner;

public class AtmCashWithDraw {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int amount = scanner.nextInt();
        
        
        if (amount % 100 != 0) {
            System.out.println("Error: Amount must be a multiple of 100.");
        }
        else if (amount > 50000) {
            System.out.println("Error: Amount exceeds 50000.");
        }
        
        else {
            calculateamount(amount);
        }
    }

    public static void calculateamount(int amount) {
        
        int[] denominations = { 2000, 500, 200, 100};
        
        System.out.println("Denomination breakdown:");
        
        
        for (int denomination : denominations) {
            if (amount / denomination > 0) {
                int count = amount / denomination; 
                System.out.println(denomination + " : " + count);
                amount -= count * denomination; 
            }

        }
    }
}
