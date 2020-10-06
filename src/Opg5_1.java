import java.util.Scanner;

public class Opg5_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int score = input.nextInt();

        if(score >= 60 && score <= 100)
            System.out.println("you have a score of: " + score + " you pass!");
        else if (score < 60 && score >= 1)
            System.out.println("you fail you miserable cunt");
        else
            System.out.println("not acceptable withing the framework" + score + "is illegal");

    }
}
