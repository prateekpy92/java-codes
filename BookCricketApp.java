package com.teclabs.assi;
import java.util.Random;
import java.util.Scanner;
public class BookCricketApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);
		        Random random = new Random();
		        
		        System.out.print("Enter Name of player1 -> ");
		        String player1 = scanner.nextLine();
		        System.out.print("Enter Name of player2 -> ");
		        String player2 = scanner.nextLine();

		        System.out.print("Total number of pages in a book -> ");
		        int totalPages = scanner.nextInt();

		        int PrateekTotalScore = playGame(player1, totalPages, scanner, random);
		        int PradeepTotalScore = playGame(player2, totalPages, scanner, random);

		        if (PrateekTotalScore > PradeepTotalScore) {
		            System.out.println(player1 + " is the winner!");
		        } else if (PrateekTotalScore < PradeepTotalScore) {
		            System.out.println(player2 + " is the winner!");
		        } else {
		            System.out.println("It's a tie!");
		        }
		    }

		    private static int playGame(String playerName, int totalPages, Scanner scanner, Random random) {
		        int totalScore = 0;
		        int turn = 1;
		        boolean continuePlaying = true;

		        System.out.println(playerName + " Starts playing ->");

		        while (continuePlaying) {
		            System.out.println("Turn  -> " + turn);
		            int pageNumber = random.nextInt(totalPages) + 1;
		            int score = pageNumber % 7;
		            totalScore += score;

		            System.out.println("Page Number Generated -> " + pageNumber + " (" + pageNumber + "%7 => " + score + ")");
		            System.out.println("Score : " + score);
		            System.out.println("Total Score : " + totalScore);

		            if (totalScore >= 9) {
		                continuePlaying = false;
		            } else {
		                System.out.print("Continue playing -> y/n -> ");
		                String continueResponse = scanner.next();
		                continuePlaying = continueResponse.equalsIgnoreCase("y");
		            }
		            turn++;
		        }

		        System.out.println(playerName + "'s Total Score: " + totalScore + " in " + (turn - 1) + " turns\n");

		        return totalScore;
		    }
		

	}


