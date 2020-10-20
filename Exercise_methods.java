import java.util.Scanner;
public class Exercise_methods {
    public static void main(String []args ){
        Scanner input = new Scanner(System.in);

        int number;

        System.out.println("Enter a number: ");
        number = input.nextInt();

        int largeNumber= number *number;
        System.out.println("Your number doubled is " + largeNumber);

        int largeNumberTwo = largeNumber + 1;
        int largeNumberThree = largeNumberTwo + 1;
        System.out.println("and here is the following numbers " + largeNumberTwo +" and "+ largeNumberThree);

        another();
        anotherOne();
    }
    public static void another(){
        Scanner input = new Scanner(System.in);
        
        double numberTwo;

        System.out.println("Enter another number: ");
        numberTwo = input.nextDouble();

        double halfNumber = numberTwo * .5;
        System.out.println("Here is the half of the original number: " + halfNumber);

        double halfNumberOne = halfNumber *.5;
        double halfNumberTwo = halfNumberOne * .5;
        System.out.println("The number that follow that one are " + halfNumberOne +
        " and " + halfNumberTwo);

    }
    
    public static void anotherOne(){
        Scanner input = new Scanner(System.in);
        
        String name;

        System.out.println("Now enter your name: ");
        name = input.next();


        int month;
        int year;
        int day;
    
        System.out.println("Enter a month (in numeric form): ");
        month = input.nextInt();

        System.out.println("Enter a two digit year: ");
        year = input.nextInt();

        System.out.println("Enter a day: ");
        day = input.nextInt();

        int magic = month * day;

        if (magic == year)
            System.out.println("congrats" + name + " it's a Magic date!");
        else
            System.out.println("Not a magic date, sorry " + name);

    }
}
