package edu.wctc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String[] choices = {"mild or spicy", "tea or coffee", "breakfast or brunch", "summer or winter", "paper or plastic"};
        int[] responses = new int[5];

        boolean play = true;

        while (play) {
            System.out.println("Welcome to the Preference Quiz!");

            // collect user responses
            for (int i = 0; i < 5; i++) {
                System.out.println("Do you prefer " + choices[i] + "?");
                System.out.println("Enter 0 for the preference on the left");
                System.out.println("Enter 1 for the preference on the right");
                int response = keyboard.nextInt();
                responses[i] = response;
            }

            // add up scores
            int score = 0;
            for (int i = 0; i < responses.length; i++) {
                int response = responses[i];
                score = score + response;
            }
            // evaluate score
            boolean isCalm = score < 3;
            boolean isActive = score > 3;

            // print answer
            if (isCalm) {
                System.out.println("You prefer life to be calm and organized");
            } else if (isActive) {
                System.out.println("You prefer life to be spontaneous and active");
            } else {
                System.out.println("You prefer a good balance in life.");
            }

            // ask user to play again
            System.out.println("Again? Enter 1 to play again, or any other key to exit.");
            keyboard.nextLine();
            String playAgain = keyboard.nextLine();
            if (playAgain != "1") {
                play = false;
            }
        }
    }
}
