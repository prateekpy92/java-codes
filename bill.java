package com.teclabs.assi;

import java.util.Scanner;

public class bill {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("enter the water bill");
		int consumed= scanner.nextInt();
		int meter_charged=75;
		int total_bill;
		int charge ;
		if (consumed <= 100) {
		    charge=consumed*5;
		    
		} else if(consumed <= 250) {
			charge=consumed*10;
		   
		}
		else  {
			charge=consumed*20;   
		}
		total_bill = charge + meter_charged;
		System.out.println("Total water bill is   :" + total_bill);
	}

}
