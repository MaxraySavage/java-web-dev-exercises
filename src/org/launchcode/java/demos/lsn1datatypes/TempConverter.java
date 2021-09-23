package org.launchcode.java.demos.lsn1datatypes;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        double fahrenheit;
        double celsius;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");

        while(!input.hasNextDouble()) {
            System.out.println(("Please input a double"));
            input.next();
        }
        fahrenheit = input.nextDouble();

        input.close();
        celsius = (fahrenheit - 32) * 5/9;
        System.out.println("The temperature in Celsius is: " + celsius + "°C");
    }
}
