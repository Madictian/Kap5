package Exempler5;

import java.util.Scanner;

public class SentinelValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("it all ends if data becomes zero");
        int data = input.nextInt();

        int sum = 0;
        while (data != 0) {
            sum += data;
            System.out.println("it all ends with 0");
            data = input.nextInt();
        }
            System.out.println("you broke the cycle " + sum + " <- and a sum");
    }
}
