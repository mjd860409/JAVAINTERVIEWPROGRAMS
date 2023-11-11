public class OccurrenceOfEachElementInAnArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,2,4,5,3};
        
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i  ; j < arr.length; j++) {
                if (arr[i] == arr[j] && i>j) {
                    break;
                }
            
                if (arr[i] == arr[j]) {
                    count++;
                }
            
                if (j == arr.length-1) {
                    System.out.print(arr[i] + " " + count);
                }
            }
        }
    }
}
