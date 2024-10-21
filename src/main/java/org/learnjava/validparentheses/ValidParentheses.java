package org.learnjava.validparentheses;

import java.util.*;

/**
 * You can find this challenge at:
 * https://leetcode.com/problems/valid-parentheses/description/
 * 
 * Please don't forget to check out the tests file.
 * 
 * You can check out the explanation here:
 * https://whimsical.com/20-valid-parentheses-EAFpHJ5zaXiZHQbQMmhNqe
 */

public class ValidParentheses {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }

        }

        return stack.isEmpty();
    }

}
