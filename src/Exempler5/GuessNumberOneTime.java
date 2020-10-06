package Exempler5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GuessNumberOneTime {
    public static void main(String[] args) {
        int number = (int)(Math.random() * 101);
        System.out.println("guess a number, it's between 0 and 100");

        System.out.println("guess: ");
        Scanner input = new Scanner(System.in);

        int guess = input.nextInt();

        if (guess == number)
            System.out.println("yep");
        else if (guess > number)
            System.out.println("go lower");
        else
            System.out.println("go higher");

    }
}
