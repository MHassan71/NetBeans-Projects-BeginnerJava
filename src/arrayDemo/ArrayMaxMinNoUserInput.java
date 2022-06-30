
package arrayDemo;

public class ArrayMaxMinNoUserInput {
    
    public static void main(String []args){
        
        double []num = new double[5];
        
        num [0] = 10;
        num [1] = -3;
        num [2] = 15;
        num [3] = 24;
        num [4] = 31;
        
        double max = num[0];
        double min = num[0];
        for (int i = 1; i < 5; i++) {
            if (max<num[i]) {
                max = num[i];
            } 
            if (min>num[i]) {
                min = num[i];
            } 
        }
        
        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);
    }
    
}
