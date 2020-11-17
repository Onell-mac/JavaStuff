import java.util.Scanner;
public class tshirtDiscount {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.println("We offer disocunt from 6-23 shirts purchased of 30% and 24 or more of 50%");

        for(int firstCostumers = 1; firstCostumers <= 20; firstCostumers ++){

            int quantity;
            int tshirtsPrice = 21;
            int amount;
            double finalAmountPaid;

            System.out.println("\nEnter the amount of tshirt purchased: " + "Customer# " + firstCostumers);
            quantity = input.nextInt();
    
            double discountAmount;

            amount = quantity * tshirtsPrice;
            System.out.println("\nHere it's your amount before discount: " + amount);

            if (quantity >= 1 && quantity <= 80){
                if (quantity <= 5){
                    System.out.println("No discount received");
                }
                else if (quantity >= 6 || quantity <= 23){
                    System.out.println("30% discount applied");
                    discountAmount = (quantity * tshirtsPrice) * 0.3;
                    System.out.println("Here it's ur discount: " + discountAmount);
                    finalAmountPaid = (amount - discountAmount);
                    System.out.println("Here it's your final price: " + finalAmountPaid);

                }
                else if (quantity >= 24 || quantity <= 80){
                    System.out.println("50% discount applied");
                    discountAmount = (quantity * tshirtsPrice) * .5;
                    System.out.println("Here it's ur discount: " + discountAmount);
                    finalAmountPaid = (amount - discountAmount);
                    System.out.println("Here it's your final price: " + finalAmountPaid);
                }
            }
            else{
                System.out.println("Invalid amount");
            }
        }
        //double average = quantity / 20;
        //System.out.println("Average quantity: " + average);

    }
}
