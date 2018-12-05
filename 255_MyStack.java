package com.example.musically.myleetcode;

import java.util.ArrayDeque;

/**
 * <pre>
 *     author : 王磊
 *     time   : 2018/12/5
 *     desc   :
 *     version: 1.0
 * </pre>
 */
public class MyStack {
    ArrayDeque<Integer> mFirstQueue;

    public MyStack() {
        mFirstQueue = new ArrayDeque<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        mFirstQueue.add(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return mFirstQueue.removeLast();
    }

    /** Get the top element. */
    public int top() {
        return mFirstQueue.getLast();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return mFirstQueue.isEmpty();
    }
}
