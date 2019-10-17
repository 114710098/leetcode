package com.zili.oj;

import java.util.Arrays;

public class LC_0167_two_sum_sorted_array {
    private static int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;

        while (i < j) {
            if (numbers[i] + numbers[j] == target) {
                break;
            } else if (numbers[i] + numbers[j] < target) {
                i += 1;
            } else {
                j -= 1;
            }
        }

        return new int[]{i + 1, j + 1};
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 8, 12, 19};
        int target = 21;

        int[] ans = LC_0167_two_sum_sorted_array.twoSum(nums, target);
        System.out.println(Arrays.toString(ans));
    }
}
