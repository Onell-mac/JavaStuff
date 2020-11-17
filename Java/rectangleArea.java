import java.util.Scanner;
public class rectangleArea {
    public static void main(String [] args){
        double length = 0;
        double width = 0;
        double area = 0;

        length = getLength(length);
        width = getWidth(width);
        area = getArea(length,width);
        displayData(length, width, area);
    }
    public static double getLength(double length){
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter the length of the rectangle: ");
        length = input.nextDouble();
        return length;
    }
    public static double getWidth(double width){
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter the width of the same rectangle: ");
        width = input.nextDouble();
        return width;
    }
    public static double getArea(double length , double width){
        double area;
        area = length * width;
        return area;
    }
    public static void displayData(double length, double width, double area){
        System.out.println("\nHere it's your length: " + length + " ,also your width: " + width + " \nAnd the area: " + area);
    }
}
