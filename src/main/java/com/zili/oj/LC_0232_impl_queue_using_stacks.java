package com.zili.oj;

import java.util.Stack;

public class LC_0232_impl_queue_using_stacks {
    class MyQueue {

        private Stack<Integer> stack = new Stack();
        private Stack<Integer> tmp = new Stack();

        /** Initialize your data structure here. */
        public MyQueue() {
        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            while (!stack.empty()) tmp.push(stack.pop());
            stack.push(x);
            while (!tmp.empty()) stack.push(tmp.pop());
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            return stack.pop();
        }

        /** Get the front element. */
        public int peek() {
            return stack.peek();
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            return stack.empty();
        }
    }

}
