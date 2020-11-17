
import java.util.Scanner;

public class ifStatement {
    public static void main(String[]  args){
        Scanner input  =  new Scanner(System.in);

        double average;
        System.out.println("Enter your average: ");
        average = input.nextDouble();

        if (average >= 60)
            System.out.println("\n Passing grade!");

        else  if(average >=40){
            System.out.println("onell");
            System.out.println("matt");
        }

        else 
            System.out.println("FAILED THE CLASS!!");

        


    }
    
}
