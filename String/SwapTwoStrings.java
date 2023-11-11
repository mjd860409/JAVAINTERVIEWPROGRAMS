package String;

public class SwapTwoStrings {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "World";

        a = a + b; //HelloWorld

        b = a.substring(0, a.length()-b.length());

        a = a.substring(b.length());

        System.out.println("Value of a is : " + a);
        System.out.println("Value of b is : " + b);
    }
}
