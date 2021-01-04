package a_Belt_8_kyu.Challenge_25_ANeedleInInTheHaystack;

public class Kata {
    public static String findNeedle(Object[] haystack) {
        return String.format("found the needle at position %d", java.util.Arrays.asList(haystack).indexOf("needle"));
    }
}
