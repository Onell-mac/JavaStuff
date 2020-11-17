import java.util.Scanner;
public class WifiTrouble2 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        String answer;

        String message = "Did that fix the problem?";

        System.out.println("\nUtilize 'Y' for yes and 'N' for no\n");

        System.out.println("Reboot the computer and try to connect. \n " + message);
        answer = input.nextLine();

        switch (answer){
            
            case "N": 
                System.out.println("Reboot the router " + message);
                answer = input.nextLine();
            break;

            case "Y":
                System.out.println("Thanks!");
            break;

        }

    }
}
