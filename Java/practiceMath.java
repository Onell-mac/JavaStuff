public class practiceMath {
    public static void main(String[]args){
        int j = 14;

        for (int i = 5; i <= j; i++){
            System.out.println("\n Morning");

            if ( i % 3 == 0)
                System.out.println("\n Sunny " + i +" "+ j);

            else if ( i % 3 == 1)
                System.out.println("\n Rainiy " + i + " "+ j);
            else 
                System.out.println("\n cloudy " + i +" "+j);

            System.out.println("\n night");

            j = j - 2;
        }
        System.out.println("looping its fun");
    }
    
}
