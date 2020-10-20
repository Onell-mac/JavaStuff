import java.util.Scanner;
public class SumOfNumbers {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        int sum = 0;
         
        System.out.println("\nI'll sum all the numbers up to the one you enter.");
        System.out.println("Enter a number:");
        int firstNumb = input.nextInt();

        for (int a = 1; a <= firstNumb; ++a){

// System.out.println(a); if you want to show the list of numbers from 1 to n 
            
            sum += a;
        }

        System.out.println("Sum: " + sum);
        
    }
    
}
 