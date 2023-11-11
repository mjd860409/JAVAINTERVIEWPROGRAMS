package String;

public class PrintCharsInEvenPosition {
    public static void main(String[] args) {
        String s = "hunter";
        char ch[] = s.toCharArray();

        for(int i = 0; i<ch.length; i++){
            if (i%2==0) {
                System.out.print(ch[i] + " ");
            }
        }
    }
}
