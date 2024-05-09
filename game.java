package com.teclabs.assi;

import java.util.Scanner;

public class game {
public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		    String choice;

		    System.out.println("Welcome to Treasure Island"
		    		+ "Your mission is to find the treasure.");

		    do {
		      System.out.println(" Left or right? ");
		      choice = scanner.nextLine();

		      if (choice.equals(" LEFT ")) 
		      {
		        System.out.println(" Swim or wait ");
		        choice = scanner.nextLine();
		        
		        if (choice.equals(" SWIM ")) 
		        {
		          System.out.println("You Win");
		          break;
		        }
		        else {
		          System.out.println("Attacked by trout. \n Game Over.");
		          break;
		        }
		      } 
		      else {
		        System.out.println("\nFall into a hole \n Game Over.");
		        break;
		      }
		    } 
		    while (true);
		  }
		

	}


