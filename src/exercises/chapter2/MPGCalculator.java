package exercises.chapter2;

import java.util.Scanner;

public class MPGCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please input miles travelled:");
        double miles = input.nextDouble();
        System.out.println("Please input gallons of gasoline used:");
        double gallons = input.nextDouble();
        System.out.println("Miles per gallon is: " + (miles/gallons));
    }
}
