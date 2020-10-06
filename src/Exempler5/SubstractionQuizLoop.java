package Exempler5;

import java.util.Scanner;

public class SubstractionQuizLoop {
    public static void main(String[] args) {
        final int questions = 5;
        int correctCount = 0;
        int count = 0;
        long startTime = System.currentTimeMillis();
        String output = "";
        Scanner input = new Scanner(System.in);

        while (count < questions){
            int number1 = (int)(Math.random() * 10);
            int number2 = (int)(Math.random() * 10);

            if(number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;}

                System.out.println("what is " + number1 + " - " + number2 + " ?");
                int answer = input.nextInt();

                if (number1 - number2 == answer) {
                    System.out.println("you got it");
                    correctCount++;
                } else
                    System.out.println("nope");
                    count++;

                output += "\n" + number1 + " - " + number2 + " = " + answer + ((number1 - number2 == answer) ? " correct": "wrong");
            }
            long endTime = System.currentTimeMillis();
            long testTime = endTime - startTime;

            System.out.println("you took " + testTime / 1000 + " seconds to complete the quiz");
        }
    }
