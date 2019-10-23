package com.zili.oj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_0448_find_all_numbers_disappeared_in_an_array_20191022054924_slow {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int n = 1;
        for (int i = 0; i < nums.length; i++) {
            System.out.printf("expect %d, actual %d\n", n, nums[i]);
            if (nums[i] == n) { //normal
                n += 1;
            }
            if (nums[i] > n) {  //断码
                System.out.println("found missing " + n);
                while (n < nums[i]) {
                    ans.add(n);
                    n += 1;
                }
                n += 1;
            }
            if (nums[i] < n) {  //重码
            }
        }
        while (n <= nums.length) {
            ans.add(n);
            n += 1;
        }
        return ans;
    }
}
