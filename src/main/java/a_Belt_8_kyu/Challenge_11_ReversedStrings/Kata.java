package a_Belt_8_kyu.Challenge_11_ReversedStrings;

public class Kata {
    public static String solution(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        String newString = stringBuilder.toString();
        return newString;
    }
}
