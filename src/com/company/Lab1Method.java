package com.company;

public class Lab1Method {
    public static void perimeter(double length, double width) {
        double per = (2 * length) + (2 * width);
        if (per % 1 == 0) {
            int perInt = (int) per;
            System.out.println("Perimeter: " + perInt);
        } else {
            System.out.println("Perimeter: " + per);
        }
    }

    public static void area(double length, double width) {
        double area = length * width;
        if (area % 1 == 0) {
            int areaInt = (int) area;
            System.out.println("Area: " + areaInt);
        } else {
            System.out.println("Area: " + area);
        }
    }
    public static void volume(double length, double width, double height){
        double volume = length * width * height;
        if (volume % 1 == 0){
            int volInt = (int) volume;
            System.out.println("Volume: " + volInt);
        }
        else {
            System.out.println("Volume: " + volume);
        }
    }
}