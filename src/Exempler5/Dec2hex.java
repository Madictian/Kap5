package Exempler5;

import java.util.Scanner;

public class Dec2hex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter and integer");
        int decimal = input.nextInt();

        String hex = "";

        while (decimal != 0){
            int hexValue = decimal % 16;

            char hexDigit = (0 <= hexValue && hexValue <= 9) ? (char)(hexValue + '0') : (char)(hexValue - 10 + 'A');

            hex = hexDigit + hex;
            decimal = decimal / 16;

        }

        System.out.println("the hex number is " + hex);

    }

}
