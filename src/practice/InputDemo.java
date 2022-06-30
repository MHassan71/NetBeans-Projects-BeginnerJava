
package practice;
import java.util.Scanner;

public class InputDemo {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
       
       double number;
       
       System.out.print("Enter decimal number:");
       
       number = input.nextDouble();
       System.out.println("Decimal number is " + number);
       
       
    }
    
}
