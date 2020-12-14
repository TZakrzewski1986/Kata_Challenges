package a_Belt_8_kyu.InvertValues;

public class Kata {
    public static int[] invert(int[] array) {
        return java.util.Arrays.stream(array).map(i -> -i).toArray();
    }
}
