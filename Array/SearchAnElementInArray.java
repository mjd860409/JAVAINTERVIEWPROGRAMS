public class SearchAnElementInArray {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int ele = 50;

        for(int i = 0; i<arr.length; i++){
            if (ele==arr[i]) {
                System.out.println("Element found at : " + i);
            }
        }

    }
}
