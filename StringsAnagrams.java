import java.util.*;

public class StringsAnagrams {
    public static void isAnagram(String a, String b) {
        // If lengths are not equal, they can't be anagrams
        if (a.length() != b.length()) {
            System.out.println("false");
            return;
        }

        // Convert strings to char arrays
        char[] arrA = a.toCharArray();
        char[] arrB = b.toCharArray();

        // Sort both arrays
        Arrays.sort(arrA);
        Arrays.sort(arrB);

        // Compare sorted arrays
        for (int i = 0; i < arrA.length; i++) {
            if (arrA[i] != arrB[i]) {
                System.out.println("false");
                return;
            }
        }

        // If no mismatches found, the strings are anagrams
        System.out.println("true");
    }

    public static void main(String[] args) {
        String a = "bacd";
        String b = "aacd";
        isAnagram(a, b); // Output: true
    }
}
