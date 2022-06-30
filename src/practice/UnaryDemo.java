
package practice;

public class UnaryDemo {
    
   public static void main(String []args){
       
       int x = 10;
       
       /*++x;
       System.out.println("Value of X: " +x);*/
       
       int result;
       
       result = x++;  // 10
       System.out.println("Value of x: " + result);
       
       result = x++;  // 11
       System.out.println("Value of x: " + result);
       
       result = ++x;  // 13
       System.out.println("Value of x: " + result);
       
       result = ++x;  // 14
       System.out.println("Value of x: " + result);
       

       result = --x; // 13
       System.out.println("Value of x: " + result);
       
       result = x--; // 13
       System.out.println("Value of x: " + result);
       
       result = --x; // 11
       System.out.println("Value of x: " + result);
       
       /*result = ++x;
       System.out.println("Value of --x: " + result);*/
       
       
   }
    
}
