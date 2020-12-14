package a_Belt_8_kyu.Challenge_21_Greeter;

public class Greeter {
    public static String greet(String name) {
        if (name.equals("Johnny")) {
            return "Hello, my love!";
        } else {
            return String.format("Hello, %s!", name);
        }
    }
}
