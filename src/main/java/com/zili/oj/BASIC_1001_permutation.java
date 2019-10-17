package com.zili.oj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BASIC_1001_permutation {
    private static void swap(Integer[] a, Integer i, Integer j) {
        Integer tmp;
        tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    private static void helper(Integer[] a, Integer pos, List<Integer[]> res) {
        if (pos == a.length) {
            res.add(Arrays.copyOf(a, a.length));
//            System.out.println(Arrays.toString(a));
            return;
        }

        for (int i = pos; i < a.length; i++) {
//            System.out.println("pos=" + pos);
            swap(a, pos, i);
//            System.out.println("swap: " + Arrays.toString(a));
            helper(a, pos + 1, res);
            swap(a, pos, i);
        }
    }

    public static List<Integer[]> permutation(Integer[] a) {
        List<Integer[]> res = new ArrayList<>();
        helper(a, 0, res);
        return res;
    }

    public static void main(String[] args) {
        List<Integer[]> res = permutation(new Integer[]{1, 2, 3});
        res.forEach(l-> System.out.println(Arrays.toString(l)));
    }
}
