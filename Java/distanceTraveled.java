import java.util.Scanner;
public class distanceTraveled {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        int speed, distanceTraveled, time;
        int timeStart = 1;


        System.out.println("\nEnter the speed traveled per hour 'MPH': ");
        speed = input.nextInt();

        System.out.println("\nEnter the number of hours traveled: ");
        time = input.nextInt();

        if (time < 1){
            System.out.println("Invalid number, speed can't be negative! ");
        }

        System.out.println("\nHere are the hours and the miles per hours you've traveled \n");
        while (timeStart <= time ){
            distanceTraveled = speed * timeStart;
            System.out.println("Hours: " + timeStart + "| Distance traveled: " + distanceTraveled);
        
            timeStart ++; 

           
        }

    }
}
