public class FindDuplicateInAnArray {
    public static void main(String[] args) {
        
        int arr[] = {1,2,2,4,5,4};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate elements are : " + arr[i]);
                }
            }
        }
    }
}
