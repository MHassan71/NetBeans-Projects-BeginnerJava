
package arrayDemo;

public class Array1 {
    
    public static void main(String []args){
        
        /*int [] number;  
        number = new int [10];*/
        
        int [] num = new int [20];
        
        num [0] = 12;
        num [1] = 15;
        num [2] = 18;
        num [3] = 22;
        num [4] = 30;
        num [5] = 27;
        
        int len = num.length;
        System.out.println(len);
        
        int sum= num [0]+num [1]+num [2]+num [3]; // 67
        System.out.println(sum);
    
    }
}
