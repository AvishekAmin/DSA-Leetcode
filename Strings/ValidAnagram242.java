package Strings;

// LeetCode 242: Valid Anagram
// Difficulty: Easy

// Approach:
// - If the lengths of the two strings are different, they cannot be anagrams.
// - Convert both strings into character arrays.
// - Sort both character arrays.
// - Compare the sorted arrays using Arrays.equals().
// - If they are identical, return true; otherwise, return false.

// Time Complexity: O(n log n)
// Space Complexity: O(n)

import java.util.Arrays;

public class ValidAnagram242 {
    public boolean isAnagram(String s, String t) {

        s = s.toLowerCase();
        t = t.toLowerCase();

        if (s.length() != t.length()) {
            return false;
        } else {
            char[] sCharArray = s.toCharArray();
            char[] tCharArray = t.toCharArray();

            Arrays.sort(sCharArray);
            Arrays.sort(tCharArray);

            boolean result = Arrays.equals(sCharArray, tCharArray);
            return result;
        }
    }
}
