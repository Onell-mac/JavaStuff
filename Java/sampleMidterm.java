import java.util.Scanner;
public class sampleMidterm {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
       
        double Kt;
        int distanceTraveled = 0;


        System.out.println("Enter how many laps you ran: ");
        int setDistance = input.nextInt();
        for ( int runn = 0; runn < setDistance; runn++){
        
            double largestNumber;
            double smallestNumber; 

            System.out.println("Enter distance traveled:  [Type 0 to exit]");
            double distanceT = input.nextInt();
            if (distanceT == 0){
                System.out.println("Thank you!");
            }
            
            distanceTraveled += runn;
        }



        int average = distanceTraveled / setDistance;
        System.out.println("\nAverage = " + average);


        if (distanceTraveled >= 30){
            System.out.println("\nLong distance");
            
        }
        else if(distanceTraveled >= 10 && distanceTraveled < 29){
            System.out.println("\nMedium distance");
            
        }
        else if(distanceTraveled <= 10){
            System.out.println("\nShort distance");
            
        }

    }
    
}
