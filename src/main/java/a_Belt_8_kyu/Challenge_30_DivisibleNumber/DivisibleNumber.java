package a_Belt_8_kyu.Challenge_30_DivisibleNumber;

public class DivisibleNumber {
    public static boolean isDivisible(long n, long x, long y) {
        return (n%x ==0) && (n%y ==0);
    }
}
