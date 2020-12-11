package a_Belt_8_kyu.Challenge_19_AbbreviateTwoWords;

public class AbbreviateTwoWords {
    public static String abbrevName(String name) {
        char[] array = name.toCharArray();
        char firstInitial = 0;
        char secondInitial = 0;
        for (int i = 0; i < array.length; i++) {
            if (Character.isUpperCase(array[i])) {
                if (secondInitial == 0) {
                    if (firstInitial == 0) {
                        firstInitial += array[i];
                    } else secondInitial += array[i];
                }
            }
        }
        return String.format("%s.%s", firstInitial, secondInitial);
    }
}
