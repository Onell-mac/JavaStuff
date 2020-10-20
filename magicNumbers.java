
import java.util.Scanner;
    class magicNumbers {
        public static void main(String [] args ){
            

            int month;
            int year;
            int day;
            
            Scanner input = new Scanner(System.in);

            System.out.println("Enter a month (in numeric form): ");
            month = input.nextInt();

            System.out.println("Enter a two digit year: ");
            year = input.nextInt();

            System.out.println("Enter a day: ");
            day = input.nextInt();

            int magic = month * day;

            if (magic == year)
                System.out.println("Magic date!");
            else
                System.out.println("Not a magic date");


        }
    
}
