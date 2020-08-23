package com.playboy.leetcode.stack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Stack;

/**
 * @author playboy
 * @create 2020-08-23 2:07 下午
 * @description
 * @serviceLogic https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/
 **/
public class StackTest1 {
    private static final Logger log = LoggerFactory.getLogger(StackTest1.class);

    public static void main(String[] args) {
        StackTest1 stackTest1 = new StackTest1();
        stackTest1.test();


    }

    public void test() {
        CQueue cQueue = new CQueue();
        cQueue.appendTail(3);


    }


    class CQueue {

        Stack<Integer> add = new Stack<>();
        Stack<Integer> delete = new Stack<>();

        public CQueue() {

        }

        public void appendTail(int value) {
            add.push(value);
        }

        public int deleteHead() {
            if (add.empty()) {
                return -1;
            }
            while (!add.empty()) {
                Integer pop = add.pop();
                delete.add(pop);
            }
            int result = delete.pop();
            while (!delete.empty()) {
                Integer pop = delete.pop();
                add.add(pop);
            }
            return result;
        }
    }
}
