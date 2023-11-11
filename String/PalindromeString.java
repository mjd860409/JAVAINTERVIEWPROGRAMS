package String;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "MADAM";
        String temp = str;
        int len = str.length();
        String rev = "";

        for (int i = len-1; i>=0; i--) {
            rev = rev + str.charAt(i);
        }

        if (temp.equals(rev)){
            System.out.println("String is Palindrome");
        }
        else {
            System.out.println("String is not palindrome");
        }
    
    }
}
