/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Part2;

/**
 *
 * @author Sashank Machiraju
 */
public class ArrayChanger {
    
public static void newarr(int arr[])
{
    for (int i = 0; i < arr.length; i++) {
    if (i % 2 == 0) {
      arr[i]= arr[i] * 2;
     } else {
       arr[i]= arr[i] * 3;
     }
   }  
  }
 
public static void main(String[] args){
   int arr[]= {3,7,9,15,24};
   newarr(arr);
   System.out.println("The elements in array: ");
        for(int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+" "+"\n");  
        }
}
}

