import javax.swing.JOptionPane;
public class GUI1 {
    public static void main( String [] args ){
        JOptionPane.showMessageDialog(null," This is a text message ");

        String name;
        name = JOptionPane.showInputDialog("Enter your name: ");


        // converting data types
        // if you need to ouput/input a double you use Double.parseDouble

        String ageString;
        ageString = JOptionPane.showInputDialog("Enter your age: ");
        double age = Double.parseDouble(ageString);

        age = age + 1;
        JOptionPane.showMessageDialog(null, "Next year " + name + " it's going to be " + age);  
    }
    
}