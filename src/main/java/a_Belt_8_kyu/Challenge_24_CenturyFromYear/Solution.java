package a_Belt_8_kyu.Challenge_24_CenturyFromYear;

import java.util.Arrays;
import java.util.List;

public class Solution {
    public static int century(int number) {
        return ((number % 100 == 0))? (number = number / 100 ) :  (number = (number / 100) + 1);
    }
}
