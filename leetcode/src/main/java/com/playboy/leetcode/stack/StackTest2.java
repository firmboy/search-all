package com.playboy.leetcode.stack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Stack;

/**
 * @author playboy
 * @create 2020-08-23 2:41 下午
 * @description
 * @serviceLogic
 **/
public class StackTest2 {
    private static final Logger log = LoggerFactory.getLogger(StackTest2.class);

    public int[] exclusiveTime(int n, List<String> logs) {
        int time = 0;
        int id = -1;
        int[] result = new int[n];
        Stack<String> strings = new Stack<>();
        for (String s : logs) {
            String[] split = s.split(":");
            int sid = Integer.valueOf(split[0]);
            int stime = Integer.valueOf(split[2]);
            String peek = strings.peek();
            if (peek == null) {
                
            }

        }

        return result;
    }

    public static void main(String[] args) {

    }
}
