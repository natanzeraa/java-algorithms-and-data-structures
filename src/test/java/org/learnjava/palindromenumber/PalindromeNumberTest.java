package org.learnjava.palindromenumber;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PalindromeNumberTest {
    @Test
    void testIsAHundredTwentyOnePalindrome() {
        var palindrome = new PalindromeNumber();
        assertTrue(palindrome.isPalindrome(121));
    }

    @Test
    void testIsThreeHundredTwentyOnePalindrome() {
        var palindrome = new PalindromeNumber();
        assertFalse(palindrome.isPalindrome(321));
    }

    @Test
    void testIsAThousandAndOnePalindrome() {
        var palindrome = new PalindromeNumber();
        assertTrue(palindrome.isPalindrome(1001));
    }

    @Test
    void testIsAMillionAndTwentyOnePalindrome() {
        var palindrome = new PalindromeNumber();
        assertFalse(palindrome.isPalindrome(1000021));
    }
}
