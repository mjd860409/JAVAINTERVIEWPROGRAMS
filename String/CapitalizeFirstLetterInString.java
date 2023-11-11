package String;

public class CapitalizeFirstLetterInString {
    public static void main(String[] args) {
        String s = "how are you";
        s = " " + s;
        String result = "";

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (ch == ' ') {
                result = result + ch;
                i++;
                ch = s.charAt(i);
                result = result + Character.toUpperCase(ch);
            }
        
            else{
                result = result + ch;
            }
        
        }
         
        result = result.trim();
        System.out.println(result);
    }
}
