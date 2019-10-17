package com.zili.oj;

import org.junit.Test;
import static org.junit.Assert.*;

public class LC_0232_impl_queue_using_stacksTest {

    @Test
    public void test() {
        System.out.println("hello");
        LC_0232_impl_queue_using_stacks s = new LC_0232_impl_queue_using_stacks();
        LC_0232_impl_queue_using_stacks.MyQueue q = s.new MyQueue();

        assertTrue(q.empty());
        q.push(1);
        q.push(2);
        q.push(3);
        assertEquals(1, q.peek());
        assertEquals(1, q.pop());
        assertFalse(q.empty());
        assertEquals(2, q.peek());
        assertEquals(2, q.pop());
        assertFalse(q.empty());
        assertEquals(3, q.peek());
        assertEquals(3, q.pop());
        assertTrue(q.empty());

        q.push(4);
        q.push(5);
        q.push(6);
        q.pop();
        q.pop();
        q.push(7);
        q.push(8);
        assertEquals(6, q.peek());
        assertEquals(6, q.pop());
        assertFalse(q.empty());
        assertEquals(7, q.peek());
        assertEquals(7, q.pop());
        assertFalse(q.empty());
        assertEquals(8, q.peek());
        assertEquals(8, q.pop());
        assertTrue(q.empty());
    }
}