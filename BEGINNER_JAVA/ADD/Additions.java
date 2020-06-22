package BEGINNER_JAVA.ADD;
import java.util.Random;
import java.util.Scanner;
public class Additions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstNum = (int)(Math.random() *10);
        int secondNum = (int)(Math.random() *10);
        int sum = firstNum + secondNum;

        System.out.printf(
        "What is %d + %d ? ", firstNum, secondNum);
        int answer = input.nextInt();

        while(sum != answer){
            System.out.println("Not Correct");
            System.out.printf(
        "What is %d + %d ? ", firstNum, secondNum);
         answer = input.nextInt();
        }

        System.out.printf(
        "Correct %d + %d is %d . ", firstNum, secondNum, sum);
    }
}