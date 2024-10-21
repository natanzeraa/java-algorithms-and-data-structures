package org.learnjava.decodeways;

/**
 * You can find this challenge at:
 * https://leetcode.com/problems/decode-ways/description/
 * 
 * Please don't forget to check out the tests file.
 * 
 * You can check out the explanation here:
 * https://whimsical.com/91-decode-ways-leet-code-problem-applying-dynamic-programming-BPTM2HRVVRLVrcv2ZWzqLj
 */
public class DecodeWays {
    public int numDecodings(String s) {
        int[] arr = new int[s.length() + 1];

        arr[0] = 1;
        arr[1] = s.charAt(0) == '0' ? 0 : 1;

        for (int i = 2; i < arr.length; i++) {
            Integer first = Integer.valueOf(s.substring(i - 1, i));
            Integer second = Integer.valueOf(s.substring(i - 2, i));

            if (first >= 1 && first <= 9) {
                arr[i] = arr[i - 1];
            }

            if (second >= 10 && second <= 26) {
                arr[i] += arr[i - 2];
            }

        }

        return arr[arr.length - 1];
    }
}