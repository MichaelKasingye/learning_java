package BEGINNER_JAVA.Loan_Pmt;
import java.util.Scanner;
public class App{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter X no. ");
        int x = input.nextInt();
        System.out.println("be4 x is " +x);
        increament(x);
        System.out.println("After return inc method is " + inc(x));
        System.out.println("After x is " +x);

}

public static void increament(int n){
    n++;
    System.out.println("inside n increament method x is " + n);
}

public static int inc(int a){
   return a++;
    }

}