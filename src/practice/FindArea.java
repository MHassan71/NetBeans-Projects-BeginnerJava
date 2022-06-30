
package practice;

import java.util.Scanner;

public class FindArea {
    
    public static void main (String []args){
        
        Scanner input = new Scanner(System.in);
        
        double b, h, area;
        
        System.out.print("Enter Base length: " );
        b = input.nextDouble();
        
        System.out.print("Enter Height length: " );
        h = input.nextDouble();
        
        area = 0.5 *b*h;
        System.out.println("Area of Triangle: " + area);
        
        
    }
    
}
