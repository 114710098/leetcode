package com.zili.oj;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC_0278_first_bad_versionTest {

    @Test
    public void firstBadVersion() {
        LC_0278_first_bad_version o = new LC_0278_first_bad_version();

//        o.setBadVersion(4);
//        assertEquals(4, o.firstBadVersion(5));
//        o.setBadVersion(2);
//        assertEquals(2, o.firstBadVersion(10));
//        o.setBadVersion(1);
//        assertEquals(1, o.firstBadVersion(2));
//        o.setBadVersion(1);
//        assertEquals(1, o.firstBadVersion(1));
        o.setBadVersion(1702766719);
        assertEquals(1702766719, o.firstBadVersion(2126753390));
    }
}