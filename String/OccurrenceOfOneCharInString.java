package String;

public class OccurrenceOfOneCharInString {
    public static void main(String[] args) {
        String s = "manas";
        int len = s.length();
        int replaceCount = s.replace("a", "").length();
        int finalCount = len-replaceCount;

        System.out.println("Occurrence of a is : " + finalCount);
    }
}
