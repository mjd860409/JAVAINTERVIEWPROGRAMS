package StringReverse;

//O/P - evaH a doog yad
public class ReverseEachWordsInString {
    public static void main(String[] args) {
        String s = "Have a good day";
        String arr[] = s.split(" ");
        String rev = "";

        for(int i = 0; i<arr.length; i++){
            String words = arr[i];
            String revWords = "";

            for(int j = words.length()-1; j>=0; j--){
                revWords = revWords + words.charAt(j);
                
            }
        
            rev = rev + revWords + " ";
        }
    
        System.out.println("Reverse is : " + rev);
        
    }
}
