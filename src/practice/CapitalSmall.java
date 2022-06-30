
package practice;

import java.util.Scanner;

public class CapitalSmall {
    
    public static void main(String []args){
        
        Scanner input = new Scanner(System.in);
        
        char ch;
        
        System.out.print("Enter any letter: ");
        ch = input.next().charAt(0);
        
        if(ch>='a' && ch<='z'){
            System.out.println("This is Small letter");
        }
        else if(ch>='A' && ch<='Z'){
            System.out.println("This is Capital letter");
        }
        else
            System.out.println("This is not a letter");
    }
}
