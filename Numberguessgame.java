import java.util.Random;
import java.util.Scanner;

public class Numberguessgame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int targetnumber = random.nextInt(100)+1;
        int guess;
        int attempts = 0;

        System.out.println("Welcome to a Number Guessing Game!");
        System.out.println("Try guessing a number from range 1 to 100");
        
        do { 
            System.out.println("Enter your guess:");
            guess = input.nextInt();
            attempts++;

            if(guess < targetnumber){
                System.out.println("Too low,Try again.");
            } else if (guess > targetnumber) {
                System.out.println("Too high,Try again.");
            }else {
                System.out.println("Congratulations! You have guessed the number correctly.");
                System.out.println("Number of attempts:" + attempts);
            } 
        } while (guess != targetnumber);
        input.close();
    }

}

