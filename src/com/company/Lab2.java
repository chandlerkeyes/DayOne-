package com.company;

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Lab2Methods object = new Lab2Methods();
        Scanner keyboard = new Scanner(System.in);
        int userInput;
        char yOrN = ' ';

        do {
            System.out.println("Enter a number between 1 and 100:");
            userInput = keyboard.nextInt();

            object.evenOdd(userInput);

            System.out.println("Continue? (y/n)");
            yOrN = keyboard.next().charAt(0);
        } while (yOrN == 'y');
    }
}