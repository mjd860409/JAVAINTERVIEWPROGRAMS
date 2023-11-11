package String;

public class PrintEvenWordsInString {
    public static void main(String[] args) {
        String s = "Java Selenium";
        String words[] = s.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (i%2==0) {
                System.out.println("Even word is : " + words[i]);

            }
        }
    }
}
