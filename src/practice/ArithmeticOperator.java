
package practice;

import java.util.Scanner;

public class ArithmeticOperator {
    
    public static void main (String []args){
        
        // Let's do it with user input
        
        Scanner input = new Scanner(System.in);
        
        int num1, num2, result;
       
        System.out.print("Enter First Number: ");
        num1 = input.nextInt();
        
        System.out.print("Enter Second Number: ");
        num2 = input.nextInt();
        
        result = num1+num2;
        System.out.println("Sum is " + result);
        
        result = num1-num2;
        System.out.println("Sub is " + result);
        
        result = num1*num2;
        System.out.println("Mult is " + result);
        
        double result2 = (double)num1/num2; // type casting making an interger number to double
        System.out.println("Div is " + result2);
        
        result = num1%num2;
        System.out.println("Remainder is " + result);
        
        









// this is done by assigning values initiation
        /*int num1, num2, result;
        
        num1 = 20;
        num2 = 15;
        
        result = num1+num2;
        System.out.println("Sum = " + result);
        
        result = num1-num2;
        System.out.println("Difference = " + result);
        
        result = num1*num2;
        System.out.println("Product = " + result);
        
        result = num1/num2;
        System.out.println("Divisin = " + result);
        
        result = num1%num2;
        System.out.println("Remainder = " + result);*/
    }
    
}
