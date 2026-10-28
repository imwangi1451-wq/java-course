// This program demonstrates the while loop using a number guessing game.
// The loop continues until the user guesses the correct number.

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Generate a random number between 1 and 100.
        int secretNumber = (int) (Math.random() * 100) + 1;
        int guess = 0;
        int attempts = 0;

        System.out.println("==================================================");
        System.out.println("               NUMBER GUESSING GAME");
        System.out.println("==================================================");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("Can you guess it?\n");

        // Keep asking until the user guesses the secret number.
        while (guess != secretNumber) {
            attempts++;
            System.out.print("Attempt " + attempts + " - Enter your guess: ");
            guess = scanner.nextInt();

            if (guess < secretNumber) {
                System.out.println("Too low! Try again.\n");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.\n");
            } else {
                System.out.println("\n🎉 Congratulations! You guessed it!");
                System.out.println("The number was: " + secretNumber);
                System.out.println("You took " + attempts + " attempt(s).");
            }
        }

        scanner.close();
    }
}