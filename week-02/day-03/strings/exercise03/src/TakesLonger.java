public class TakesLonger {
    public static void main(String[] args) {

    String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

    StringBuilder str = new StringBuilder(quote);
        str.insert(20, " always takes longer than");

        System.out.println(str.toString());
    }
}
