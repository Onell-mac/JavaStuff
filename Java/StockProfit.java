import java.util.Scanner;
public class StockProfit {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        
        // NS = number of shares
        // PP = the purchase price per share 
        // PC = purchase commisiion paid 
        // SP = sale price per share
        // SC = sale commission paid 

        // Profit formula = ((NS x SP) - SC) - ((NS x PP) + PC)

        System.out.println("\nEnter the number of shares: ");
        double NS = input.nextDouble();

        System.out.println("Enter the purchase price: ");
        double PP = input.nextDouble();

        System.out.println("Enter the purchase commission paid: ");
        double PC = input.nextDouble();

        System.out.println("Enter the sale price per share: ");
        double SP = input.nextDouble();

        System.out.println("Enter the sales commission paid: ");
        double SC = input.nextDouble();

        double profit;
        profit = profitCalculation(NS, PP, PC, SP, SC);

        if (profit < 0){
            System.out.printf("Lost of money by $%,.2f" , profit);
        }else { 
            System.out.printf("You made a profit of  $%,.2f" , profit);
        }
    
    }
    public static double profitCalculation(double NS, double PP, double PC, double SP, double SC){
        double profit; 
        profit = ((NS * SP) - SC) - ((NS * PP) + PC);
        return profit;
    }


}
