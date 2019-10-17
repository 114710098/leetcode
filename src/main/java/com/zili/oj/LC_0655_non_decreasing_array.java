package com.zili.oj;

public class LC_0655_non_decreasing_array {
    private boolean isAsc(int[] nums, int off) {
        if(off<0) off = 0;
        boolean ans=true;
        int i=off;
        while (i < nums.length-1) {
            if(nums[i+1]<nums[i]) return false;
            i+=1;
        }
        return ans;
    }
    public boolean checkPossibility(int[] nums) {
        int bak;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] > nums[i + 1]) {
                //adjust nums[i]
                bak = nums[i];
                if(i!=0)
                    nums[i] = (nums[i - 1] + nums[i + 1]) / 2;
                else
                    nums[i] = nums[i + 1];
                if (isAsc(nums, i-1)) return true;
                nums[i] = bak;
                //ajust nums[i+1]
                if(i==nums.length-2) return true;
                nums[i+1] = (nums[i] + nums[i + 2]) / 2;
                if(isAsc(nums,i)) return true;
                return false;
            }
        }
        return true;
    }
}
