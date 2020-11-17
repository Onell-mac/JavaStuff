import java.util.Scanner;
class Main2 
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);

        double numb1, numb2, average;

        System.out.println("Enter a number: ");
        numb1 = input.nextDouble();

        System.out.println("Enter another number; ");
        numb2 = input.nextDouble();

        average = (numb1 + numb2) / 2;
        System.out.println("The average is " + average);
    }
    
}
