import java.util.Arrays;
import java.util.Scanner;

import easy.LongestCommonPrefix;
import easy.RomanToInteger;
import easy.ValidParentheses;

public class App {

    public static void main(String[] args) {
        // RomanToInteger romanToInteger = new RomanToInteger();
        // System.out.println(romanToInteger.romanToInt("MCMXCIV"));
//LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
//String[] input = { "dog", "racecar", "car", "race" };
//System.out.println(longestCommonPrefix.longestCommonPrefix(input));
        ValidParentheses vp = new ValidParentheses();
        System.out.println(vp.isValid("({}[])"));
    }
}
