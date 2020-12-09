package a_Belt_8_kyu.Challenge_13_SmallestIntegerFinder;

import java.util.Arrays;

public class Kata {
    public static int findSmallestInt(int[] args) {
        Arrays.sort(args);
        return args[0];
    }
}
