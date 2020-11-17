import javax.swing.JOptionPane;
public class newProject{
    public static void main(String []args){
        JOptionPane.showMessageDialog(null, "I will create a GUI to help you in your case of need!");

        
        String [] options = {"Yes, Please", "No, Thank you!" , "Im not sure!"};
       
        String name;
        name = JOptionPane.showInputDialog("Enter Your Name: ");
    

        int i = JOptionPane.showOptionDialog(null, "would you like to continue?", "Welcome" + name, JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);

        String x = String.valueOf(i);

        do{
           JOptionPane.showMessageDialog(null, "If this in an emergency call 911", "EMERGENCY??", JOptionPane.WARNING_MESSAGE);
    
        }
        while(!x.equals(options[0]));{
           JOptionPane.showMessageDialog(null,"Press [okay] to exit", "exit",JOptionPane.OK_OPTION);
        }
    }
    
}
