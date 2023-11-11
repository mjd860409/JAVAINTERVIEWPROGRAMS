package String;

public class RemoveJunkCharacters {
    public static void main(String[] args) {
        String s = "abc@@#!()";
        String s1 = s.replaceAll("[^a-zA-Z0-9]", "");

        System.out.println(s1);
    }
}
