import java.util.Scanner;
public class Arithmetic {

    public static void main (String [] args){

        Scanner input = new Scanner(System.in);

        int x, y;

        System.out.println("Enter a number: ");
        x = input.nextInt();

        System.out.println("Enter another number: ");
        y = input.nextInt();
        sumOfnumber(x, y);
    } 


    public static void sumOfnumber( int x, int y){ 

        int sum = x + y;
        System.out.println("Here it's the sum: " + sum);

    }
}
