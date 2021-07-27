package a_Belt_8_kyu.Challenge_33_WillYouMakeIt;

public class Kata {
    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        return distanceToPump <= mpg * fuelLeft;
    }
}
