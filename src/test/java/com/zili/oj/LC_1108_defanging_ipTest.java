package com.zili.oj;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC_1108_defanging_ipTest {

    @Test
    public void defangIPaddr() {
        assertEquals("1[.]2[.]3[.]4", LC_1108_defanging_ip.defangIPaddr("1.2.3.4"));
        assertEquals("123[.]123[.]123[.]123", LC_1108_defanging_ip.defangIPaddr("123.123.123.123"));
    }
}