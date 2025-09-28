
public class SplitMethod {
    static public void main(String... args) {
        String text = "Hello   World\tJava\nProgramming";
        String[] words = text.trim().split("\\s+");
        System.out.println(text.length());
        for (String word : words) {
            System.out.println(word);
        }
    }
}
