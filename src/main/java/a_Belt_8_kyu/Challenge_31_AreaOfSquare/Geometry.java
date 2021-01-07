package a_Belt_8_kyu.Challenge_31_AreaOfSquare;

public class Geometry {
    public static double squareArea(double A){
        double circuitOfCircle = A*4;
        double rLength = (circuitOfCircle/Math.PI)/2;
        double areaOfSquare = Math.pow(rLength,2);
        return Double.parseDouble(String.format("%10.2f", areaOfSquare));
    }
}
