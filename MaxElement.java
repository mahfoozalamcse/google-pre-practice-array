public class MaxElement {
    public static int max(int arr[]){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
      int arr[] = {12, 89, 99, 90, 76};
      System.out.println(max(arr)); 
    }
}
