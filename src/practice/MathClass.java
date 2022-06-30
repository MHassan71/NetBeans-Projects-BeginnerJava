
package practice;

public class MathClass {
    
    public static void main(String []args){
        
        int num1 = -17;
        int num2 = 20;
        int num3 = 10;
        
        double a = 1.47;
        double b = 2;
        double c = 20;
        
        // Find the largest numbers from 3 numbers
        int max = Math.max(num1, num2);
        max = Math.max(num3, max);
        System.out.println("Largest number: " + max);
        
        // Find the smallest numbers from 3 numbers
        int min = Math.min(num1, num2);
        min = Math.min(num3, min);
        System.out.println("Smallest number: " + min);
        
        // Find the average of 3 numbers
        int sum = num1+num2+num3;
        double avg = (double)sum/3;
        System.out.println("Average of numbers: " + avg);
        
        // Find the absoute value of a number
        
        int absolute = Math.abs(num1);
        System.out.println("Absolute of num1: " + absolute);
        
        double power = Math.pow(a, b);
        System.out.println("a to the power b = " +power);
        
        double round = Math.round(a);
        System.out.println("Round value of number a = " + round);
        
        double squareRoot = Math.sqrt(c);
        System.out.println("Square root of c = "+squareRoot);
        
        int round1 = Math.round(8.47f);
        System.out.println("Round of 8.47 = " +round1);
        
        double pi = Math.PI;
        System.out.println("pi = "+pi);
    }
    
}
