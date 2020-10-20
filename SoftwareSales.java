import java.util.Scanner;
public class SoftwareSales {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        int quantity;
        int pack = 99;

        System.out.println("Our package retails for $99");
        System.out.println("Our discount it's based on Quantity purchased! \n");

        System.out.println("Enter amount of packages purchased: ");
        quantity = input.nextInt();

        if (quantity <= 19 && quantity >= 10)
            System.out.println("Discount is 20%");

        else if (quantity >= 20 && quantity <= 49)
            System.out.println("Discount is 30%");

        else if (quantity >= 50 && quantity <= 99)
            System.out.println("Discount is 40%");

        else if (quantity >= 100)
            System.out.println("Discount is 50%");

        else if (quantity < 10)
            System.out.println("No Discount!");

    }
    
}
