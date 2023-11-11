public class FindMaxNoInAnArray {
    public static void main(String[] args) {
        int arr[] = {23,45,67,1,4};
        int max = arr[0];

        for(int i = 1; i<arr.length; i++){
            if (arr[i] > max) {
                max = arr[i];
            }
        }
      
        System.out.println("Maximum number in array is : " + max);
    
    }
}
