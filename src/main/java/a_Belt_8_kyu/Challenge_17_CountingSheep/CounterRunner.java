package a_Belt_8_kyu.Challenge_17_CountingSheep;

public class CounterRunner {
    public static void main(String[] args) {
        Boolean[] sheeps = {true, false, true, null, true, true};
        Counter counter = new Counter();
        System.out.println(counter.countSheeps(sheeps));
    }
}
