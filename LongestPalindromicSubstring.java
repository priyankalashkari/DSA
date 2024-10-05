public class LongestPalindromicSubstring {

        // Method to check if a string is a palindrome
        private static boolean isPalindrome(String str) {
            int start = 0;
            int end = str.length() - 1;
    
            while (start < end) {
                if (str.charAt(start) != str.charAt(end)) {
                    return false;
                }
                start++;
                end--;
            }
            return true;
        }
    
        // Method to find all substrings of a given string
        public static void findSubstrings(String s) {
            int n = s.length();
            String longestPalindrome = "";
    
            // Iterate through all possible substrings
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    // Get the current substring
                    String substring = s.substring(i, j);
                    
                    // Check if it is a palindrome
                    if (isPalindrome(substring)) {
                        System.out.println("Palindromic Substring: " + substring);
    
                        // Update the longest palindromic substring found
                        if (substring.length() > longestPalindrome.length()) {
                            longestPalindrome = substring;
                        }
                    }
                }
            }
    
            // Print the longest palindromic substring found
            System.out.println("Longest Palindromic Substring: " + longestPalindrome);
        }
    
        public static void main(String[] args) {
            String s = "babad";
            findSubstrings(s);
        }
}
    

