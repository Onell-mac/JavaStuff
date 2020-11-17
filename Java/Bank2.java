import javax.swing.JOptionPane;
public class Bank2 {
    public static void main(String[]args){
        JOptionPane.showMessageDialog(null, "Welcome To The Bank ");
        
        String choice;
        choice = JOptionPane.showInputDialog(null, " MENU \n1.Deposit\n2.Withdraw\n3.Check Balance\n4.Exit\nSelect choice:");

        switch(choice){
            case "1":
                String money = JOptionPane.showInputDialog(null, "How much you'll like to deposit: ");
                
                break;

            case "2":
        
            
        default:
            
        }


    }
    
}
