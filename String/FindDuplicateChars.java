package String;

public class FindDuplicateChars {
    public static void main(String[] args) {
        String s = "manas";
        char ch[] = s.toCharArray();
    
        for(int i = 0; i<s.length(); i++){
            for(int j = i+1; j<s.length(); j++)
                if (ch[i] == ch[j]) {
                    System.out.println("Duplicate char is : " + ch[j]);
                }
            }
        }

    
    }

