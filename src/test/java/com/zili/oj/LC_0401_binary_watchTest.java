package com.zili.oj;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class LC_0401_binary_watchTest {

    @Test
    public void readBinaryWatch() {
        LC_0401_binary_watch o = new LC_0401_binary_watch();

        String[] expect = null;
        String[] actual = null;

        expect = new String[]{"1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "0:32"};
        actual = o.readBinaryWatch(1).toArray(new String[0]);
        Arrays.sort(actual);
        Arrays.sort(expect);
        assertArrayEquals(expect, actual);
    }
}