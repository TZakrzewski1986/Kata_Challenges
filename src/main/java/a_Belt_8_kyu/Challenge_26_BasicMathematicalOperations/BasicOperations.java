package a_Belt_8_kyu.Challenge_26_BasicMathematicalOperations;

public class BasicOperations {
    public static Integer basicMath(String op, int v1, int v2) {
        Integer result = 0;
        switch (op) {
            case "+": {
                return result = v1 + v2;
            }
            case "-": {
                return result = v1 - v2;
            }
            case "*": {
                return result = v1 * v2;
            }
            case "/": {
                return result = v1 / v2;
            }
        }
        return result;
    }
}
