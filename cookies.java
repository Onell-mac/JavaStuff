import java.util.Scanner;
class cookies {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        double x;
        double y;
        int c = 40;
        int z = 4;
        int calories = 300;
        double dif;
        dif = (calories / z);
        
        System.out.println("I have a bag with 10 serving withing 40 cookies, and each serving is 300 calories");
        System.out.println("Enter the amount of cookies you ate: ");
        x = input.nextInt();

        y = dif * x;
        System.out.println("This is the amount of calories you have ate: " + y);
        System.out.println("Amount of calories per cookies:" + dif );

    }
    
}
