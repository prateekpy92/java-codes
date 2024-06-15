package com.teclabs.assi;

import java.util.Scanner;

public class bill {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the water consumption in units:");
        int consumed = scanner.nextInt();
        int meter_charge = 75;
        int total_bill;
        int charge;

        if (consumed <= 100) {
            charge = consumed * 5;
        } else if (consumed <= 250) {
            charge = 100 * 5 + (consumed - 100) * 10;
        } else {
            charge = 100 * 5 + 150 * 10 + (consumed - 250) * 20;
        }

        total_bill = charge + meter_charge;
        System.out.println("Total water bill is: " + total_bill);
    }
}

