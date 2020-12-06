package Challenge_7_Removing_First_And_Last_Char;

import java.util.Arrays;

public class RemoveChars {
    public static String remove(String str) {
        return str.substring(1, str.length() - 1);


  /*      int strLength = str.length();
        String result = "";
        for (int i = 0; i < strLength - 1; i++) {
            if (i != 0 ) {
                result = result + str.charAt(i);
            }
        }
        return result;*/
    }
}
