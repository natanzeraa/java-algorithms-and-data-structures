package org.learnjava.decodeways;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DecodeWaysTest {
    @Test
    void shoudlReturnIntegerNumberTwo() {
        var decode = new DecodeWays();
        assertEquals(2, decode.numDecodings("12"));
    }

    @Test
    void shoudlReturnIntegerNumberThree() {
        var decode = new DecodeWays();
        assertEquals(3, decode.numDecodings("226"));
    }

    @Test
    void shoudlReturnIntegerNumberZero() {
        var decode = new DecodeWays();
        assertEquals(0, decode.numDecodings("124053"));
    }
}
