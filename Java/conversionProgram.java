import java.util.Scanner;
public class conversionProgram {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        String action = "[ENTER]";
        String actionTwo = " Meter is ";
        double kilometers = 0;
        double inches = 0;
        double feet = 0;
    
        System.out.print("\nEnter the diatnce in Meters: " + action + " ");
        double meters = input.nextInt();

        menu(action);
        int choice = input.nextInt();

        while (choice != 4){    
            switch (choice) {
                case 1:
                    kilometers = showKilometers(kilometers, meters);
                    System.out.println(meters + actionTwo + kilometers + " Kilometers");
                    break;
                case 2:
                    inches = showInches(inches, meters);
                    System.out.println(meters + actionTwo+ inches + " Inches");
                    break;
                case 3:
                    feet = showFeet(feet, meters);
                    System.out.println(meters + actionTwo +feet + " Feet");
                    break;
                default:
                    System.out.println("Invalid input!!!");
                    break;
            }
            System.out.print("\nEnter the diatnce in Meters: " + action + " ");
            meters = input.nextInt();
            System.out.println();
            menu(action);
            choice = input.nextInt();
            
        }
        

    }
    public static void menu(String action){
        System.out.println("1. Convert to Kilometers.");
        System.out.println("2. Convert to inches.");
        System.out.println("3. Convert to feet.");
        System.out.println("4. Quit the program.");
        System.out.print("\nEnter your choice: " + action + " ");
    }
    public static double showKilometers(double kilometers, double meters){

        kilometers = meters * 0.001;
        return kilometers;

    }
    public static double showFeet(double feet, double meters){

        feet = meters * 3.281;
        return feet;
    }
    public static double showInches(double inches, double meters){

        inches = meters * 39.37;
        return inches;
    }
}
