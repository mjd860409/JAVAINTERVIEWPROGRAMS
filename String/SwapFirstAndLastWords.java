package String;

//O/P - day a good Have
public class SwapFirstAndLastWords {
    public static void main(String[] args) {
        String s = "Have a good day";
        String [] words = s.split(" ");

        //Swap first and last 2 words using temp variable

        String temp = words[0];
        words[0] = words[words.length-1];
        words[words.length-1] = temp;

        //Join the words back into a single string

        String result = String.join(" ", words);
        System.out.println("After swapping : " + result);
    
    }
}
