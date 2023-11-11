package String;

public class FindTotalCharsInString {
    public static void main(String[] args) {
        String s = "hunter";
        int count = 0;

        for(int i = 0; i<s.length(); i++){
            if (s.charAt(i)!=0) {
                count++;
            }
        }
        
        System.out.println("Total number of characters is : " + count);
    }


    }

