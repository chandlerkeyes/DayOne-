package com.company;
import java.util.Scanner;

public class Lab1{
    public static void main(String[] args) {
        //create scanner object, declare variables, and create a Lab1Method object
        Lab1Method object = new Lab1Method();
        Scanner keyboard = new Scanner(System.in);
        char input = ' ';

        // this loop should iterate if the user enters y, otherwise end of program
        do {
            //prompt user to input length, width, height(BONUS)
            System.out.println("Enter length:");
            double length = keyboard.nextDouble();
            System.out.println("Enter width:");
            double width = keyboard.nextDouble();
            System.out.println("Enter height:");
            double height = keyboard.nextDouble();

            //invoking methods from Lab1Method
            object.area(length, width);
            object.perimeter(length, width);
            object.volume(length, width, height);

            //Ask user if they want to continue
            System.out.println("Continue? (y/n)");
            input = keyboard.next().charAt(0);
        } while (input == 'y');

    }
}