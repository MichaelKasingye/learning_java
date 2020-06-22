//Code has a bug when calculating less than 50% PTI

package BEGINNER_JAVA.Loan_Pmt;
import java.util.Scanner;
public class CalculateloanInstallmentPayment {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
         System.out.print("Enter Loan Amount: ");
         double loanAmount = input.nextDouble();

         System.out.print("Enter how long the loan in months: ");
         double monthlyLoanPeriod = input.nextDouble();

         System.out.print("Enter interest Rate: ");
         double interestRate = input.nextDouble();

         System.out.print("Enter Net salary to computer max loan amount: ");
         double netSalary = input.nextDouble();

        //System.out.printf("Monthly pay is %d\n", (int)loanMonthlyPayment(loanAmount,monthlyLoanPeriod,interestRate) );
        double TheloanMonthlyPayment = loanMonthlyPayment(loanAmount,monthlyLoanPeriod,interestRate);
        
        // 50% paymentToIncomeRatio
        double paymentToIncomeRatio = TheloanMonthlyPayment/netSalary;
       
        if(paymentToIncomeRatio > 0.5 ){
            System.out.printf(
            "Loan Instalment is above %d percent your salay", paymentToIncomeRatio);
            System.out.println();
            System.out.printf("Adjust the Loan amount and period");
         }else{
            System.out.printf(
            "Monthly pay and ratio is %d is %d\n",paymentToIncomeRatio, (int)TheloanMonthlyPayment);
         }
    }
    
    // loanMonthlyPayment method
    public static double loanMonthlyPayment(double loanAmount, double monthlyLoanPeriod, double interestRate) {
    double annualLoanPeriod = monthlyLoanPeriod / 12;
    double percentageRate = interestRate / 100;
    double monthlyInterestRate = percentageRate / 12;
    double accumulativeLoanPeriods = 12 * annualLoanPeriod;
        //Implementing loan calculation formular
    double monthlyPayment = loanAmount * monthlyInterestRate / ( 1 - Math.pow(1 + monthlyInterestRate, - accumulativeLoanPeriods));
    return monthlyPayment;
    }

}

