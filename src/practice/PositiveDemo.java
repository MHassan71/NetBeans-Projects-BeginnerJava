
package practice;

public class PositiveDemo {
    
    public static void main(String[] args) {
        int num1 =99;
        if (num1>=90){
            System.out.println("You've got an A");
        }
        else if (num1>=80 && num1<89){
           System.out.println("You've got a B"); 
        }
          
        else if (num1>=70 && num1<79){
           System.out.println("You've got a C"); 
        }
        
        else if (num1>=60 && num1<69){
           System.out.println("You've got a D");
        }
        else
        System.out.println("You've got F");
        
    }
    
}
