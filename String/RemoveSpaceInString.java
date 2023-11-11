package String;

//O/P Haveagoodday
public class RemoveSpaceInString {
    public static void main(String[] args) {
        String s = "Have a good day";
        String s1 = s.replaceAll("\\s", "");
        System.out.println(s1);
    }
}
