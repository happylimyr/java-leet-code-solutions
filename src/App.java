import java.util.Arrays;
import java.util.Scanner;

public class App {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a.length() != b.length()) {
            return false;
        }

        char[] charA = a.toLowerCase().toCharArray();
        char[] charB = b.toLowerCase().toCharArray();

        Arrays.sort(charA);
        Arrays.sort(charB);

        return Arrays.equals(charA, charB);

        // a = a.toLowerCase();
        // b = b.toLowerCase();

        // int[] charCounts = new int[26];

        // for (int i = 0; i < a.length(); i++) {
        // charCounts[a.charAt(i) - 'a']++;
        // charCounts[b.charAt(i) - 'a']--;
        // }

        // for (int count : charCounts) {
        // if (count != 0) {
        // return false;
        // }
        // }

        // return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
