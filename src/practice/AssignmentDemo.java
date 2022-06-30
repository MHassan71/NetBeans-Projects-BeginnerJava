
package practice;

public class AssignmentDemo {
    
    public static void main(String[]args){
        
        int x = 3;
        int y = 2;
        
        x+=y;  // x = x+y = 3+2 = 5 
        System.out.println("x and y sum: " +x);
        
        x-=y;  // x = x-y = 5-2 = 3 
        System.out.println("x and y sub: " +x);
        
        x*=y;  // x = x*y = 3*2 = 6
        System.out.println("x and y mult: " +x);
        
        x/=y;  // x = x/y = 6/2 = 3
        System.out.println("x and y div: " +x);
        
        x%=y;  // x = x%y = 3%2 = 1
        System.out.println("x and y remainder: " +x);
    }
    
}
