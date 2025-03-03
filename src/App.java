import java.util.Arrays;
import java.util.Scanner;

import easy.RemoveDuplicatesFromSortedArray;
import easy.RomanToInteger;

public class App {
    public static void main(String[] args) {
//        RomanToInteger romanToInteger = new RomanToInteger();
//        System.out.println(romanToInteger.romanToInt("MCMXCIV"));
        RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicatesFromSortedArray.removeDuplicates(arr));
    }
}
