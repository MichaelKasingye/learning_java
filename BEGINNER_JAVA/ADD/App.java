package BEGINNER_JAVA.ADD;
import java.util.Scanner;
public class App{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1st num");
        int num1 = input.nextInt();
        System.out.println("Enter 1st num");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.printf("Sum is %d\n",sum);
    }
}