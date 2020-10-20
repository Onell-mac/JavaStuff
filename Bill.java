import java.util.Scanner;
class Bill{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); 

        double x;
        double tax = 0.0675;
        double tip = 0.2;

        System.out.println("\n Enter the amount you paid for your food: ");
        x =input.nextInt();

        System.out.println(" \n Here is the meal charge: " +  x + "\n" );

        double tax_amount = ( x * tax);
        System.out.println("\n Tax amount: " + tax_amount + "\n");

        double total_without = ( tax_amount + x);

        double tip_amount = ( tip * total_without);

        System.out.println("\n Tip amount: " + tip_amount + "\n" );

        double total = ( tip_amount + total_without);
        System.out.println("Your tota after tip would be: " + total + "\n");







    }

}