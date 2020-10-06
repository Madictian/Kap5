package Exempler5;

import java.util.Scanner;

public class TestDoWhile {
    public static void main(String[] args) {
        int data;
        int sum = 0;

        Scanner input = new Scanner(System.in);

        do{
            System.out.println("integer please (it all end if you enter 0): ");
            data = input.nextInt();

            sum += data;
        }while (data != 0);
        System.out.println(" the sum is " + sum);
    }
}
