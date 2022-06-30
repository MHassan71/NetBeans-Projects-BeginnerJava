package practice;
           
public class SwitchStatement {
        
    public static void main(String[] args) {

        String Grade = "c";
        
        switch(Grade.toLowerCase()){
            case "a":
                System.out.println("Grade is excellent");
                break;

            case "b":
                System.out.println("Grade is Good");
                break;

            case "c":
                System.out.println("Grade is Average");
                break;

            default:
                System.out.println("You got failed");

        }

    }

}
