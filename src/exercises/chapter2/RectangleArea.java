package exercises.chapter2;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please input integer rectangle length:");
        int length = input.nextInt();
        System.out.println("Please input integer rectangle width:");
        int width = input.nextInt();
        System.out.println("The rectangle area is: " + (length * width));
    }
}
