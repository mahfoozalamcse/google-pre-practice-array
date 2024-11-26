import java.util.*;
public class ArraywaveForm{
    // wave form which simple sort arrray into wave form
    // up down manner

    public static void waveFormArray(int arr[]){
    //    Neive approch 
    //   step1 sort Array
    //   swap next element and move further
    
    Arrays.sort(arr);
    for (int i = 0; i < arr.length-1; i+=2) {
        int temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;
         
      }
    }
    public static void printArray(int arr[]){
      for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + " ");
      }
    }
    public static void main(String[] args) {
       int arr[] = {10, 5, 6, 3, 2, 20, 100, 80};
       waveFormArray(arr);
       printArray(arr);
    }
}