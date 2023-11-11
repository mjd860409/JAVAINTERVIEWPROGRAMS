package StringReverse;

//O/P : day good a Have

public class ReverseStringOne {
    public static void main(String[] args) {
        String s = "Have a good day";
        String arr [] = s.split(" ");

        for(int i = arr.length-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
