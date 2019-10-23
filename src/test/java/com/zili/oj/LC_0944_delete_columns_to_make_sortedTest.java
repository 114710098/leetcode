package com.zili.oj;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC_0944_delete_columns_to_make_sortedTest {

    @Test
    public void minDeletionSize() {
        LC_0944_delete_columns_to_make_sorted o = new LC_0944_delete_columns_to_make_sorted();
        assertEquals(1, o.minDeletionSize(new String[]{"cba", "daf", "ghi"}));
        assertEquals(0, o.minDeletionSize(new String[]{"a", "b"}));
        assertEquals(3, o.minDeletionSize(new String[]{"zyx", "wvu", "tsr"}));
    }
}