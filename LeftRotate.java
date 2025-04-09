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
    // Neive solution
    // check code 
    public static void rotateByD(int arr[], int d){

        int n = arr.length;
        int temp[] = new int[n];

        //1.  copy till d to last position

        for (int i = d; i < n; i++) {
            temp[i] = arr[i];
        }

        // copy till 0 to d postion
        for (int i = 0; i < d; i++) {
            temp[n-d] = arr[i];
        }

        // copy temp to original array
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }

    }

    // efficient
    public static void rotation

    // print array
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" "); 
        }
    }

  public static void main(String[] args) {
   int arr[] = {1, 2, 4, 9};
  // leftRotateOne(arr);
    rotateByD(arr, 2);
   printArray(arr);
  }
}
