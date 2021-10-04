package exercises.chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> testList = new ArrayList<>();
        testList.add(1);
        testList.add(43);
        testList.add(-10);
        testList.add(22);
        testList.add(72);
        testList.add(-90);
        testList.add(1);
        testList.add(3);
        testList.add(4);
        testList.add(76);
        System.out.println(sumArrayList(testList));
        ArrayList<String> testWordList = new ArrayList<>();
        String sentence = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        char[] testArray = sentence.toCharArray();
        for(char c : testArray){
            System.out.println(c);
        }

        ArrayList<String> sentenceList = new ArrayList<>(Arrays.asList(sentence.split(" ")));
        printFiveLetterWords(sentenceList);
    }

    public static int sumArrayList(ArrayList<Integer> intList) {
        int sum = 0;
        for(int i : intList) {
            sum += i;
        }
        return sum;
    }

    public static void printFiveLetterWords(ArrayList<String> wordList) {
        Scanner input = new Scanner(System.in);
        System.out.println("What word length would you like to search for?");
        int targetLength = input.nextInt();
        for(String word : wordList) {
            if(word.length() == targetLength) {
                System.out.println(word);
            }
        }
    }
}
