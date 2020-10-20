import java.util.Scanner;
public class BankCharges {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        int WrittenChecks;
        double total;
        int baseFee = 10;
        String message = "Here's your total ";
        String messageOne = "You'll also pay a fee of ";

        System.out.println("The Bank charges a base fee od $10 plus other fees.");
        System.out.println("Enter the amount of checks written this month: ");
        WrittenChecks = input.nextInt();

        // $.10 each for less than 20 checks
        // $.08 each for 20-39 checks  
        // $.06 each for 40-59 checks
        // $.04 each for 60 or more cheks


        if(WrittenChecks <= 20 && WrittenChecks >= 0){
            System.out.println(messageOne + ".10 per check");
            total = (WrittenChecks * .10) + baseFee;
            System.out.println(message + total);

        }
        else if (WrittenChecks >= 20 && WrittenChecks <= 39){
            System.out.println(messageOne + ".08  per check");
            total = (WrittenChecks * .08) + baseFee;
            System.out.println(message + total);
        }
        else if (WrittenChecks >= 40 && WrittenChecks <= 59){
            System.out.println(messageOne + ".06  per check");
            total = (WrittenChecks * .06) + baseFee;
            System.out.println(message + total);
        }
        else if (WrittenChecks >= 60){
            System.out.println(messageOne + ".04  per check");
            total = (WrittenChecks * .04) + baseFee;
            System.out.println(message + total);

        }
    }
    
}
