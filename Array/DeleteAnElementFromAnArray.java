public class DeleteAnElementFromAnArray {
    public static void main(String[] args) {
        
        int arr [] = {2,3,4,5,6,7};
        int del_ele = 4;

        for (int i = 0; i < arr.length; i++) {
            if (del_ele==arr[i]) {
                for(int j = i; j<arr.length-1; j++){
                    arr[j] = arr[j+1];
                }
                 
                break;
            }
        }
    
        for(int i = 0; i<arr.length-1; i++){
            System.out.print(arr[i] + " ");
        }
    
    }
}
