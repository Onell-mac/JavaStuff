
import java.util.Scanner;
public class MobileServiceProvider {
     
    public static void main(String []args){

        //Package A characteristic 
        double packageA = 39.99;
        int minutesA = 450;
        double additionalA = 0.45;

        //Package B characteristic
        double packageB = 59.99;
        int minutesB = 900; 
        double AdditionalB = 0.40;

        //Package C characteristic
        double packageC = 69.99;
        Scanner input = new Scanner(System.in);

        String serviceString;
        double minutesUsed;
        double total1;
        double totalFinal;

        System.out.println("\nEnter the package to calculate your montly bill \n Using the next letters 'A', 'B', 'C' : ");
        serviceString = input.next();

        if (serviceString.equalsIgnoreCase("A")){
            System.out.println("For $39.99 per month, 450 minutes provided. Additional are $0.45 per minute.");
            System.out.println("\n Now enter the amount of minutes you have used: ");
            minutesUsed = input.nextDouble();
            if (minutesUsed <= 450)
                System.out.println("Your bill is $39.99");
            else {
                total1= (minutesUsed - minutesA);
                totalFinal = (total1 * additionalA) + packageA;
                System.out.println("Your bill is now: " + totalFinal);
            }
        }
        else if (serviceString.equalsIgnoreCase("B")){
            System.out.println("For $59.99 per month, 900 minutes provided. Additional are $0.40 per minute.");
            System.out.println("\n Now enter the amount of minutes you have used: ");
            minutesUsed = input.nextDouble();
            if (minutesUsed <= 900)
                System.out.println("Your bill is $59.99");
            else {
                total1= (minutesUsed - minutesB);
                totalFinal = (total1 * AdditionalB) + packageB;
                System.out.println("Your bill is now: " + totalFinal);
            }
        }
        else if (serviceString.equalsIgnoreCase("C"))
            System.out.println("For $69.99 per month, unlimited minutes provided");


    }  
}
