import java.util.Scanner;
public class Compare {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        
        String name1;
        System.out.println("Enter a name: ");
        name1 = input.next();


        String name2;
        System.out.println("Enter another name: ");
        name2 = input.next();
        
        
        if (name1.compareTo(name2) > 0)
            System.out.println(name2 + " " + name1);
        else
            System.out.println(name1 + " " + name2);

    }
    
}
