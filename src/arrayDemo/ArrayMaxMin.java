
package arrayDemo;

import java.util.Scanner;

public class ArrayMaxMin {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double [] num = new double [5];
        
        System.out.print("Enter 5 numbers please: ");
        
        for (int i = 0; i <5; i++) {
           num [i] = input.nextDouble(); 
        }
        
       double max = num[0];
        for (int i = 1; i < 5; i++) {
            if (max<num[i]) {
                max = num[i];
            }
        }
        
        System.out.println("Max number: " + max);
        
        
        double min = num[0];
        for (int i = 1; i < 5; i++) {
            if (min>num[i]) {
                min = num[i];
            }
        }
        
        System.out.println("Min number: " + min);
    }
}
