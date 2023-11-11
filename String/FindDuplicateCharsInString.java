package String;

public class FindDuplicateCharsInString {
    public static void main(String[] args) {
        String s = "aabbcc";
        int length = s.length();
        char ch[] = s.toCharArray();

        for (int i = 0; i< length; i++){
            for (int j = i+1; j< length; j++){
                if (ch[i] == ch[j]){
                    System.out.println("Duplicate characters are : " + ch[j]);


                }
            }
        }

    }
}
