
package arrayDemo;

public class TryNewPercentD {
    
    public static void main(String[] args) {
        
        int []arr1 = new int []{1,2,3,4,5,6,7};
        int arr2 []= new int [arr1.length];
        
        int a = arr1.length;
        
        System.out.println("Length of Array: " + a);
        
        for (int i = 0; i < arr1.length; i++) {
            arr2[i]=arr1[i];
            
        }
        
        // Displaying elements of array arr1
        System.out.println("Elements of original array: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] +" ");
            
        }
        
        System.out.println();
        
        // Displaying elements of array arr2
        System.out.println("Elements of new array: ");
        
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] +" ");
            
        }
        
      // convert minutes into hours
        /*int time = 120;
        int hours = time/60;
        int minutes = time % 60;
        
        System.out.printf("%d:%d", hours, minutes);*/
    }
    
}
