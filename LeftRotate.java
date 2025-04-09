public class LeftRotate {

    // left rotate by one
    public static void leftRotateOne(int arr[]){
        int temp = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
    }

    // left rotate by D position
    

    // print array
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" "); 
        }
    }

  public static void main(String[] args) {
   int arr[] = {1, 2, 4, 9};
   leftRotateOne(arr);
   printArray(arr);
  }
}
