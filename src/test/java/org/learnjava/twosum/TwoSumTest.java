package org.learnjava.twosum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void shouldReturnAnArrayWithPositionsZeroAndOne() {
        var twoSum = new TwoSum();
        assertArrayEquals(new int[]{0, 1}, twoSum.twoSum(new int[]{2, 7, 11, 15}, 9));
    }

    @Test
    void shouldReturnAnArrayWithPositionsOneAndTwo() {
        var twoSum = new TwoSum();
        assertArrayEquals(new int[]{1, 2}, twoSum.twoSum(new int[]{3, 2, 4}, 6));
    }

    @Test
    void shouldReturnAnArrayWithPositionsTwoAndFour() {
        var twoSum = new TwoSum();
        assertArrayEquals(new int[]{2, 4}, twoSum.twoSum(new int[]{24, 7, 2, 15, 6, 3}, 8));
    }

}