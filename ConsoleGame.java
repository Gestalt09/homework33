package homework3;
import java.util.Scanner;

public class ConsoleGame {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Guess a number between 1 and 100");

        int input =0;
        int low =1;
        int guess =50;
        int high =101;

        while (input != 2) {
            System.out.println("Is your number " + guess + "?" );
            System.out.println("1> No, my number is lower. " );
            System.out.println("2> Yes ,that is my number.");
            System.out.println("3> No, number is higher");

            input = in.nextInt();
            if (input ==1) {
                guess = low + (guess - low) / 2;
            }else if (input ==3){
                low=guess;
                guess = guess + (high - guess) / 2;
            }
        }
   System.out.println("Your number was " + guess + ".");
    }
}
