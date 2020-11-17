public class TemperatureTable {
    public static void main(String[]args){
        System.out.println("\nI will print out a table, that displays \nCelsius temperature from 0 through 20 and it's equivalent in Farenheit");

        for(double c = 1; c <= 20; c++){
            double f = ((c * 9/5) + 32);

            System.out.println("Celsius " + c + "\t" +"|Fahrenheit " + f);
        }
    }
    
}
