package String;

import java.util.HashMap;

public class FirstNonRepeatedCharInString {
    public static void main(String[] args) {
        String s = "amazon";
        HashMap<Character,Integer> map = new HashMap<>();

        for (int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (map.get(ch)==null){
                map.put(ch,1);
            }
            else {
                map.put(ch, map.get(ch)+1);
            }
          }

        for (int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (ch==1){
                System.out.println(ch);
            }
        }  
    }
}
