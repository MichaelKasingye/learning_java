package BEGINNER_JAVA.Loops;
import java.util.Scanner;
public class Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int randomNum = (int)(Math.random()*10);

        //System.out.println("Guess the number");
        int guess = -1;

       // System.out.printf("number is %d", randomNum);

        while(guess != randomNum){
            System.out.println("Guess the number");
            guess = input.nextInt();
            if(guess < randomNum){
                System.out.println("Guessed is too low");
            }else if(guess > randomNum){
                System.out.println("Guessed is too high");
        }
        }
        System.out.println("Correct Guess");
         System.out.printf("number is %d", randomNum);
    }
}