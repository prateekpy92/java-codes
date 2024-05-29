import java.util.Scanner;
import java.util.Random;

public class PigGame {
    private static final int WINNING_SCORE = 20;
    private final Scanner scanner;
    private final Random random;

    public PigGame() {
        scanner = new Scanner(System.in);
        random = new Random();
    }

    public void play() {
        int totalScore = 0;
        int turnNumber = 0;

        while (totalScore < WINNING_SCORE) {
            turnNumber++;
            int turnScore = playTurn();
            totalScore += turnScore;
            System.out.println("Total score: " + totalScore);
            System.out.println();
        }

        System.out.println("You finished in " + turnNumber + " turns!");
        System.out.println("Game over!");
    }

    private int playTurn() {
        int turnScore = 0;
        int die;

        System.out.println("TURN " + turnNumber);

        do {
            die = rollDie();
            System.out.println("You rolled: " + die);

            if (die == 1) {
                System.out.println("Turn over. No score.");
                return 0;
            }

            turnScore += die;
            System.out.println("Turn score: " + turnScore);
            System.out.println("Roll or hold? (r/h): ");
        } while (shouldRollAgain());

        return turnScore;
    }

    private boolean shouldRollAgain() {
        char choice = scanner.next().charAt(0);
        return choice == 'r';
    }

    private int rollDie() {
        return random.nextInt(6) + 1;
    }

    public static void main(String[] args) {
        PigGame pigGame = new PigGame();
        pigGame.play();
    }
}
