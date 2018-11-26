package ictgradschool.industry.exceptions.arraysandexceptions;

import ictgradschool.Keyboard;

/**
 * A simple program that generates an array of random numbers, then displays
 * one of them (user's choice).
 */
public class ArraysAndExceptions {


    /**
     * Runs the program.
     *
     * TODO Handle your InvalidIndexException, IndexTooLowException, and IndexTooHighException appropriately.
     */
    public void start() {

        int[] myArray = generateArray();

        // TODO Handle any exceptions generated by this line appropriately.
        // TODO If an exception is thrown, display an appropriate error message and let the user try again.
        int index = getArrayIndexFromUser();

        System.out.println("The element at index " + index + " is: " + myArray[index]);
    }

    /**
     * Gets an array index from the given user. Currently error-prone as it doesn't check whether the user
     * inputs valid numbers of the correct size.
     *
     * TODO Follow these steps:
     * <ol>
     *     <li>Create three new checked Exception classes (i.e. extends Exception):
     *     <ul>
     *         <li>InvalidIndexException</li>
     *         <li>IndexTooLowException</li>
     *         <li>IndexTooHighException</li>
     *     </ul>
     *     </li>
     *     <li>Declare this method to throw these three kinds of exceptions (using the throws clause)</li>
     *     <li>Throw InvalidIndexException if the user doesn't enter an integer</li>
     *     <li>Throw IndexTooLowException if the user enters an integer that's too small to be a valid index</li>
     *     <li>Throw IndexTooHighException if the user enters an integer that's too large to be a valid index</li>
     * </ol>
     */
    private int getArrayIndexFromUser() {

        System.out.print("Enter an index: ");

        int index = Integer.parseInt(Keyboard.readInput());
        return index;

    }

    /**
     * Creates and returns an array with five random numbers.
     */
    private int[] generateArray() {
        int[] nArray= new int[5];
        for (int i = 0; i < nArray.length; i++) {
            nArray[i]=(int)(Math.random()*100000);
        }
        // TODO Create an array of length five, and fill it with random integers
        // TODO (say, between 1 - 1000, but doesn't really matter).
        return nArray;
    }

    public static void main(String[] args) {
        new ArraysAndExceptions().start();
    }

}
