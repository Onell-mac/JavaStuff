import java.util.Scanner;
public class WifiTrouble {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("\nUtilize 'Y' for yes and 'N' for no\n");
        
        String answer;
        String message = "Did that fix the problem? ";

        System.out.println("Reboot the computer and try to connect. \n" + message);
        answer = input.nextLine();

        if (answer.equalsIgnoreCase("N")){
            System.out.println("Reboot the router and try to connect. \n" + message);
            answer = input.nextLine();

            if (answer.equalsIgnoreCase("N")){
                System.out.println("Make sure the cables between the router & modem are plugged in. \n" + message);
                answer = input.nextLine();
            }
            if (answer.equalsIgnoreCase("N")){
                System.out.println("Move the roter to a new location. \n" + message);
                answer = input.nextLine();
            }
            else if (answer.equalsIgnoreCase("N"))
                System.out.println("Get a new router ");
            
            else if (answer.equalsIgnoreCase("Y"))
                System.out.println("Thank you!");
            
        }
        else 
            System.out.println("Thank you!");

    }
    
}