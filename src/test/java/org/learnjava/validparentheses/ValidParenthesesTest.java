package org.learnjava.validparentheses;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ValidParenthesesTest {
    @Test
    void testIsValidShouldReturnTrueForOpenAndClosedParentheses() {
        var validate = new ValidParentheses();
        assertTrue(validate.isValid("()"), "The condition must return true.");
    }

    @Test
    void testIsValidShouldReturnTrueForOpenAndClosedParenthesesBracketsAndBraces() {
        var validate = new ValidParentheses();
        assertTrue(validate.isValid("()[]{}"), "The condition must return true.");
    }

    @Test
    void testIsValidShouldReturnFalseForOpenParentheseAndClosedBracket() {
        var validate = new ValidParentheses();
        assertFalse(validate.isValid("(]"), "The condition must return false.");
    }

    @Test
    void testIsValidShouldReturnTrueForOpenAndClosedParenthesesAndInnerOpenClosedBrackets() {
        var validate = new ValidParentheses();
        assertTrue(validate.isValid("([])"), "The condition must return true.");
    }

    @Test
    void testIsValidShouldReturnFalseForOddStringLength() {
        var validate = new ValidParentheses();
        assertFalse(validate.isValid("(]("), "The condition must return false.");
    }
}
