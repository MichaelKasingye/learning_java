package BEGINNER_JAVA.Loops;
import java.util.Scanner;
public class SentielLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int enterNumber = -1;
        System.out.println("Enter number, enter -1 to stop");

        while(enterNumber != 0){
            enterNumber = input.nextInt();
        }
        
    }
}