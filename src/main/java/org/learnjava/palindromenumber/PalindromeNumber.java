package org.learnjava.palindromenumber;

/**
 * You can find this challenge at:
 * https://leetcode.com/problems/palindrome-number/
 * 
 * Please don't forget to check out the tests file.
 */

public class PalindromeNumber {
    public boolean isPalindrome(int x) {

        String normalStr = Integer.toString(x);

        String reversedStr = "";

        for (int i = 0; i < normalStr.length(); i++) {
            int reversedIndex = (normalStr.length() - i) - 1;
            reversedStr += normalStr.charAt(reversedIndex);
        }

        return reversedStr.equals(normalStr);
    }

}
