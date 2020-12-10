package a_Belt_8_kyu.Challenge_16_SquareSum;

public class Kata {
    public static int squareSum(int[] n){
        int squareSum = 0;
        for (int x = 0; x < n.length; x++) {
            int y = (int)Math.pow(n[x],2);
            squareSum += y;
        }
        return squareSum;
    }
}
