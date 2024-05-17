package com.teclabs.assi;

import java.util.Scanner;
import java.util.Random;

public class pig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int totalScore = 0;
        int turnScore;
        int turnNumber = 0;

        while (totalScore < 20) {
            turnNumber++;
            turnScore = 0;
            boolean continueTurn = true;

            System.out.println("TURN " + turnNumber);

            while (continueTurn) {
                int die = rollDie(random);

                System.out.println("You rolled: " + die);

                if (die == 1) {
                    System.out.println("Turn over. No score.");
                    turnScore = 0;
                    continueTurn = false;
                } else {
                    turnScore += die;
                    System.out.println("Turn score: " + turnScore);
                    System.out.println("Roll or hold? (r/h): ");
                    char choice = scanner.next().charAt(0);

                    if (choice == 'h') {
                        continueTurn = false;
                    }
                }
            }

            totalScore += turnScore;
            System.out.println("Total score: " + totalScore);
            System.out.println();
        }

        System.out.println("You finished in " + turnNumber + " turns!");
        System.out.println("Game over!");
    }

    public static int rollDie(Random random) {
        return random.nextInt(6) + 1; 
    }
}

