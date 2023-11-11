package String;

public class PalindromeWords {
    public static void main(String[] args) {
        String s = "mom dad child ada";
        String words[] = s.split(" ");

        for (String word : words) {
            int i1 = 0;
            int i2 = word.length()-1;
            boolean isPalindrome = false;

            while (i2>i1) {
                if (word.charAt(i1)!=word.charAt(i2)) {
                    isPalindrome = false;
                    break;
                }
                i1++;
                i2--;
            }
        
            if (isPalindrome) {
                System.out.println(word);
            }
        }
    }
}
