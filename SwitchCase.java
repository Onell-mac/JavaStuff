public class SwitchCase {
    public static void main(String[] args) {

        String dog = "great dane";

        switch(dog){
            case "pomerarian":
                System.out.println("small dog");
                break;
            case "great dane":
                System.out.println("large dog");
                break;
            default:
                System.out.println("try a different name");
        }
    }    
}
