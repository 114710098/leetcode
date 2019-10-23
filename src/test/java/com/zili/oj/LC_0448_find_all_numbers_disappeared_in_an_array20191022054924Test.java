package com.zili.oj;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class LC_0448_find_all_numbers_disappeared_in_an_array20191022054924Test {

    @Test
    public void findDisappearedNumbers() {
        LC_0448_find_all_numbers_disappeared_in_an_array_20191022054924_slow o = new LC_0448_find_all_numbers_disappeared_in_an_array_20191022054924_slow();
//        assertArrayEquals(new ArrayList<Integer>(Arrays.asList(5,6)).toArray(), o.findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}).toArray());
//        assertArrayEquals(new ArrayList<Integer>(Arrays.asList(1)).toArray(), o.findDisappearedNumbers(new int[]{3,2,2,3}).toArray());
        assertArrayEquals(new ArrayList<Integer>(Arrays.asList(2)).toArray(), o.findDisappearedNumbers(new int[]{1,1}).toArray());
        assertArrayEquals(new ArrayList<Integer>(Arrays.asList(3,4)).toArray(), o.findDisappearedNumbers(new int[]{1,1,2,2}).toArray());
    }
}