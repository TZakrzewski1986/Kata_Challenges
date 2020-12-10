package a_Belt_8_kyu.Challenge_15_GrasshopperSummation;

public class GrassHopper {
    public static int summation(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
