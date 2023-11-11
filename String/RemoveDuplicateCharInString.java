package String;

public class RemoveDuplicateCharInString {
    public static void main(String[] args) {
        String s = "aabbcc";
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            int idx = s.indexOf(ch, i+1);
            if (idx == -1) {
                sb.append(ch);
            }
        }
    
        System.out.println("After removing duplicate characters : " + sb);
    }
}
