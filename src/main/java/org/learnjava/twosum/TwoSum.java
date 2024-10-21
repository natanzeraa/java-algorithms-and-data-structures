package org.learnjava.twosum;

import java.util.*;

/**
 * You can find this challenge at:
 * https://leetcode.com/problems/two-sum/description/
 * Please don't forget to check out the tests file.
 */

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hash = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer complementIndex = hash.get(nums[i]);

            if (complementIndex != null) {
                return new int[] { complementIndex, i };
            }

            hash.put(target - nums[i], i);
        }
        return nums;
    }
}
