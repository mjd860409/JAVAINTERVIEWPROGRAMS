public class FindTwoSumProblem {
    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int target = 9;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] == target-arr[i]) {
                    System.out.println("index is" + " " + i +" "+ "number is " + arr[i]);
                    System.out.println("index is" + " " + i +" "+ "number is " + arr[j]);
                }
            }
        }
    }
}
