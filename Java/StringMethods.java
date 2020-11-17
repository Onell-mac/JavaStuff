import java.util.Scanner;
public class StringMethods {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        String name, upperName;
        int theLength;

        System.out.println("Enter  your name: ");
        name = input.next();

        System.out.println("Your name is " + name);

        theLength = name.length();
        System.out.println("There are " + theLength + " letters in " + name);

        upperName = name.toUpperCase();
        System.out.println("Your name is " + upperName);
        
    }
    
}
