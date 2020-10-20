import java.util.Scanner;

public class gradeCalculator {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        double average;
         System.out.println("Enter your average: ");
         average = input.nextDouble();

        if ( average > 100 || average < 0 )
            System.out.println("Invalid grade");
        else if (average >= 90)
            System.out.println("Your average is an A");
        else if (average  >= 80)
            System.out.println("Your average is a B ");
        else if (average >= 70)
            System.out.println("Your average is a c");
        else if (average >= 60)
            System.out.println("Your average is a D");
        else if (average > 0)
            System.out.println("You failed the class");   
    }
    
}
