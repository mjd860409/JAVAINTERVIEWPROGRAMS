package String;

public class FindTotalNoOfWordsInString {
    public static void main(String[] args) {
        String s = "I have Hunter";
        int count = 1;

        for(int i = 0; i<s.length(); i++){
            if ((s.charAt(i)==' ') && (s.charAt(i+1)!=' ')) {
                count++;
            }
        }

        System.out.println("Total no of words in the string : " + count);
    }
}
