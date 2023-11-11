public class FindMinimumNoInAnArray {
    public static void main(String[] args) {
        int arr[] = {23,45,67,1,4};
        int min = arr[0];

        for(int i = 1; i< arr.length; i++){
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        
        System.out.println("Minimum number is : " + min);
    }
}
