package a_Belt_8_kyu.Challenge_9_RepeatString;

public class Solution {
    public static String repeatStr(final int repeat, final String string) {
        String result = "";
        for (int i = 0; i < repeat; i++ ) {
            result = result.concat(string);
        }
        return result;
    }
}
