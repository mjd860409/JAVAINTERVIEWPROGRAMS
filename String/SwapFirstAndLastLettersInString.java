package String;

public class SwapFirstAndLastLettersInString {
    public static void main(String[] args) {
        String s = "manas";
        char first = s.charAt(0);
        char last = s.charAt(s.length()-1);
        String mid = s.substring(1, s.length()-1);
        String result = last + mid + first;
        System.out.println(result);
    }
}
