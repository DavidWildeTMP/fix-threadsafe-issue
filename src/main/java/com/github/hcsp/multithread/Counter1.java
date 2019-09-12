package com.github.hcsp.multithread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Second method to solve this problem
 * Use AtomicInteger
 */


public class Counter1 {

    AtomicInteger value = new AtomicInteger(0);

    public int getValue() {
        return value.get();
    }

    // 加上一个整数i，并返回加之后的结果
    public int addAndGet(int i) {
        return value.addAndGet(i);
    }

    // 减去一个整数i，并返回减之后的结果
    public int minusAndGet(int i) {
        return value.addAndGet(-i);
    }
}
