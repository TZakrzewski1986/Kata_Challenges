package a_Belt_8_kyu.Challenge_6_OnlyPositive;

public class Positive {
    public static int sum(int[] arr){
        int sumOfAllPositive = 0;
        for (int x: arr) {
            if (x >= 0) {
                sumOfAllPositive += x;
            }
        }
        return sumOfAllPositive;
    }
}
