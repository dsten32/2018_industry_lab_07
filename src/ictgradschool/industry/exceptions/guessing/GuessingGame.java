package ictgradschool.industry.exceptions.guessing;

import ictgradschool.Keyboard;

/**
 * A guessing game!
 */
public class GuessingGame {

    /**
     * Plays the actual guessing game.
     *
     * You shouldn't need to edit this method for this exercise.
     */
    public void start() {

        int number = getRandomValue();
        int guess = 0;

        while (guess != number) {

            guess = getUserGuess();

            while (guess<1 || guess>100){
                System.out.println("Invalid number, please chose between 1-100.");
                guess = getUserGuess();
            }

            if (guess > number) {
                System.out.println("Too high!");
            }
            else if (guess < number) {
                System.out.println("Too low!");
            }
            else {
                System.out.println("Perfect!");
            }

        }

    }

    /**
     * Gets a random integer between 1 and 100.
     *
     * You shouldn't need to edit this method for this exercise.
     */
    private int getRandomValue() {
        return (int) (Math.random() * 100) + 1;
    }

    /**
     * Gets the user's guess from the keyboard. Currently assumes that the user will always enter a valid guess.
     *
     * TODOne Implement some error handling, for the cases where the user enters a value that's too big, too small, or
     * TODOne not an integer. Change this method so it's guaranteed to return an integer between 1 & 100, inclusive.
     */
    private int getUserGuess() {
        System.out.print("Enter your guess: ");
        int guess=-1;
        try {
            guess=Integer.parseInt(Keyboard.readInput());
        } catch (NumberFormatException e){
            System.out.println("That was not a number, please try again.");
        }

        return guess;
    }

    /**
     * Program entry point. Do not edit.
     */
    public static void main(String[] args) {

        GuessingGame ex = new GuessingGame();
        ex.start();

    }
}
