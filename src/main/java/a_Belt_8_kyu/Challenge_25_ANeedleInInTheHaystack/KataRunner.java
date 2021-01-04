package a_Belt_8_kyu.Challenge_25_ANeedleInInTheHaystack;

public class KataRunner {
    public static void main(String[] args) {
        Object[] haystack1 = {"3", "123124234", null, "needle", "world", "hay", 2, "3", true, false};
        System.out.println(Kata.findNeedle(haystack1));
    }
}
