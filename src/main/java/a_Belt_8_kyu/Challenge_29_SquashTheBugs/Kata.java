package a_Belt_8_kyu.Challenge_29_SquashTheBugs;

public class Kata {
    public static int findLongest(String str) {
        String[] spl = str.split(" ");
        int longest = 0;
        for (int i=0; i < spl.length; i++) {
            if (spl[i].length() > longest) {
                longest = spl[i].length();
            }
        }
        return longest;
    }
}
