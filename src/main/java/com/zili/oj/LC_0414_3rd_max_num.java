package com.zili.oj;

import java.security.cert.TrustAnchor;

public class LC_0414_3rd_max_num {
    public int thirdMax(int[] nums) {
        int flag=0;
        int m1=-0x7fffffff;
        int m2=-0x7fffffff;
        int m3=-0x7fffffff;
        int N = nums.length;
        for (int i = 0; i < N; i++) {
            if(nums[i]==m1||nums[i]==m2||nums[i]==m3) continue;
            if (flag == 0) {
                m1 = nums[i];
                flag = 1;
                continue;
            }
            if (flag == 1) {
                if (nums[i] > m1) {
                    m3=m2;
                    m2=m1;
                    m1 = nums[i];
                    flag = 2;
                    continue;
                }
                m2 = nums[i];
                flag = 2;
                continue;
            }
            if (flag == 2) {
                if (nums[i] > m1) {
                    m3=m2;
                    m2=m1;
                    m1 = nums[i];
                    flag = 3;
                    continue;
                }
                if (nums[i] > m2) {
                    m3=m2;
                    m2 = nums[i];
                    flag = 3;
                    continue;
                }
                m3 = nums[i];
                flag = 3;
                continue;
            }
            if (nums[i] > m1) {
                m3=m2;
                m2=m1;
                m1 = nums[i];
                continue;
            }
            if (nums[i] > m2) {
                m3=m2;
                m2 = nums[i];
                continue;
            }
            if (nums[i] > m3) {
                m3 = nums[i];
                continue;
            }
        }
//        System.out.println(m1);
//        System.out.println(m2);
//        System.out.println(m3);
        if(flag<3) return m1;
        return m3;
    }
}
