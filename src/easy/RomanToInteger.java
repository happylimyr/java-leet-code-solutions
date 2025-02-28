package easy;

import java.util.HashMap;

public class RomanToInteger {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romMap = new HashMap<>();
        romMap.put('I', 1);
        romMap.put('V', 5);
        romMap.put('X', 10);
        romMap.put('L', 50);
        romMap.put('C', 100);
        romMap.put('D', 500);
        romMap.put('M', 1000);

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1
                    && romMap.get(s.charAt(i)) < romMap.get(s.charAt(i + 1))) {
                result -= romMap.get(s.charAt(i));
            } else {
                result += romMap.get(s.charAt(i));
            }
        }
        return result; // MCMXCIV = 1994 +1000 -100 +1000 -10 +100 -1 +5
    }
}
