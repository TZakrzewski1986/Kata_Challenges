package a_Belt_8_kyu.Challenge_20_LostWithoutMap;


public class Maps {
    public static int[] map(int[] arr) {
        int[] array = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            array[i] = arr[i] + arr[i];
        }
        return array;
    }
}
