/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author veerc
 */
public class algoarray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        
        int[]arr = new int[] {5, 10, 20, 25, 35, 40, 50};
       int max= arr[0];
       
       for(int i=1;i<arr.length;i++)
       {
        
           if (arr[i] > max){
           max=arr[i];
           }
               
           
       }
           
        
           
        
        System.out.println("The maximum value is " +max);
                
    }
    
}
