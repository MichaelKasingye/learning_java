package classes.claculateArea;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double length;
        double width;
        
        System.out.println("Enter length"); 
        length = input.nextDouble();
        
        System.out.println("Enter width"); 
        width = input.nextDouble();

        CalculateArea rectangle1 = new CalculateArea(length, width);
        System.out.print("rectangle1: " + rectangle1.toString() +"\n");

        CalculateArea rectangle2 = new CalculateArea(30.0, 50.2);
        System.out.print("rectangle2: " + rectangle2.toString());
    }
}
