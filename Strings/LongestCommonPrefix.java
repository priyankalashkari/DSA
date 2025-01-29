package Strings;

public class LongestCommonPrefix {

/*
 * Write a function to find the longest common prefix string amongst an array of strings.

   If there is no common prefix, return an empty string "".
   
    
   
   Example 1:
   
   Input: strs = ["flower","flow","flight"]
   Output: "fl"
   Example 2:
   
   Input: strs = ["dog","racecar","car"]
   Output: ""
   Explanation: There is no common prefix among the input strings.
*/

    public String longestCommonPrefix(String[] strs) {
        /*
         * BruteForce Approach: Time complexity: O(firstStringLength * N) & Space complexity: O(1).
         * String str = strs[0];
           String finalAns = "";
           for(int i = 0; i < str.length(); i++){
               for(int j = 0; j < strs.length; j++){
                   String curr = strs[j];
                   if(i + 1> curr.length() || str.charAt(i) != curr.charAt(i)){
                       return finalAns;
                   }
               }
               finalAns += str.charAt(i);
           }
           return finalAns;
        */
        
        // Optimized: Used StringBuilder 
        
        String str = strs[0];
        StringBuilder finalAns = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            for(int j = 0; j < strs.length; j++){
                String curr = strs[j];
                if(i + 1> curr.length() || str.charAt(i) != curr.charAt(i)){
                    return finalAns.toString();
                }
            }
            finalAns.append(str.charAt(i));
        }
        return finalAns.toString();
    }
    public static void main(String[] args) {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        // Test cases
        String[] test1 = {"flower", "flow", "flight"};
        System.out.println(lcp.longestCommonPrefix(test1)); // Output: "fl"

        String[] test2 = {"dog", "racecar", "car"};
        System.out.println(lcp.longestCommonPrefix(test2)); // Output: ""

        String[] test3 = {"apple", "ape", "april"};
        System.out.println(lcp.longestCommonPrefix(test3)); // Output: "ap"
    }
}
