package com.company;
import java.util.Scanner;

public class Lab1{
    public static void main(String[] args) {

        Lab1Method object = new Lab1Method();
        Scanner keyboard = new Scanner(System.in);
        char input = ' ';


        do {
            System.out.println("Enter length:");
            double length = keyboard.nextDouble();
            System.out.println("Enter width:");
            double width = keyboard.nextDouble();
            System.out.println("Enter height:");
            double height = keyboard.nextDouble();

            object.area(length, width);
            object.perimeter(length, width);
            object.volume(length, width, height);

            System.out.println("Continue? (y/n)");
            input = keyboard.next().charAt(0);
        } while (input == 'y');

    }
}