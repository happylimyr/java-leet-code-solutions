package easy;

public class LengthLastWord {
    public int lengthOfLastWord(String s) {
        String[] res = s.split(" ");
        return res[res.length - 1].length();

    }
}

// memory save
// int count = 0;
// int n = s.length();

// // Start from the end of the string
// int i = n - 1;

// // Skip trailing spaces
// while (i >= 0 && s.charAt(i) == ' ') {
// i--;
// }

// // Count the length of the last word
// while (i >= 0 && s.charAt(i) != ' ') {
// count++;
// i--;
// }

// return count;