package romannum;

import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {
    private static Map<Character, Integer> map;

    static {
        map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    public int convertRomanNumToInt(String romanNumber) {
        int convertedNumber = 0;
        int prevValue = 0;

        for (int i = romanNumber.length() - 1; i >= 0; i--) {
            char c = romanNumber.charAt(i);
            int value = map.getOrDefault(c, -1); // ป้องกันอักษรที่ไม่ใช่โรมัน

            if (value == -1) {
                throw new IllegalArgumentException("Invalid Roman numeral character: " + c);
            }

            if (value < prevValue) {
                convertedNumber -= value;
            } else {
                convertedNumber += value;
            }

            prevValue = value;
        }

        return convertedNumber;
    }
}


