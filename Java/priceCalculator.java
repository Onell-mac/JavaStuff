import java.util.Scanner;
public class priceCalculator {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        double amount = 0;
        int percentage = 0;
        double calculationOfPercentage;

        System.out.println("\nEnter the wholesale of your item: ");
        int calculateRetail = input.nextInt();

// Here we pass the value calculateRetail to the new double variable amount.

        amount += calculateRetail;

        System.out.println("\nEnter it's markeup percentage %:  ");
        calculateRetail = input.nextInt();

// Calculation mathwise we calculate the percentage and then add the whole sale cost to the new cost.

        if(calculateRetail <= 50){ 
            
            calculationOfPercentage = 50.0 / 100 * amount;
            System.out.println("\n Calculated percentage: " + calculationOfPercentage);
            amount = calculationOfPercentage + amount;
            System.out.println("\n New amount of item: " + amount);

        }
        else if (calculateRetail == 100){
            calculationOfPercentage = 100.0 / 100 * amount;
            System.out.println("\n Calculated percentage: " + calculationOfPercentage);
            amount = calculationOfPercentage + amount;
            System.out.println("\n New amount of item: " + amount);

        }

    }

}
