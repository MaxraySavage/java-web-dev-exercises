package exercises;

import java.util.Locale;
import java.util.Scanner;


public class Alice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String aliceText = "Alice was beginning to get very tired of sitting by her sister " +
                "on the bank, and of having nothing to do: once or twice she had peeped into the " +
                "book her sister was reading, but it had no pictures or conversations in it, " +
                "'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        System.out.println(("Input text to search for:"));
        String searchText = input.nextLine();
        int textIndex = aliceText.toLowerCase().indexOf(searchText.toLowerCase());
        if(textIndex == -1){
            System.out.println("Not found");
        } else{
            System.out.println("Found at: " + textIndex);
            System.out.println("Text length is: " + searchText.length());
            String newAliceText = aliceText.replaceFirst(searchText, "");
            System.out.println(newAliceText);
        }


    }
}
