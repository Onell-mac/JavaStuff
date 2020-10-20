import java.util.Scanner;
public class largestSmallest {
    public static void main(String []args ){
        Scanner in = new Scanner(System.in);

        int programExit = -99;
        int smallestNumber;
        int largestNumber;

        System.out.print("\nEnter a list of numbers to display Largest and Smallest:" + "\n[Type -99 to end] ");
        int numberList = in.nextInt();

        smallestNumber = numberList;
        largestNumber = numberList;

        while( numberList != programExit ){
            if (numberList < smallestNumber){
                smallestNumber = numberList;
            }
            else if(numberList > largestNumber){
                largestNumber = numberList;
            }
            System.out.print("[Type -99 to end] ");
            numberList = in.nextInt();

        }
        System.out.println("Smallest number " + smallestNumber + " Largest number " + largestNumber);
    }
}