package com.playboy.leetcode.recursive;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author playboy
 * @create 2020-08-20 8:30 下午
 * @description
 * @serviceLogic
 **/
public class RecursiveTest2 {
    private static final Logger log = LoggerFactory.getLogger(RecursiveTest2.class);

    static Map<Integer, Integer> cache = new HashMap();

    public static void main(String[] args) {
        System.out.println(tribonacci(35));
    }

    public static int tribonacci(int n) {
        if (cache.get(n) != null) {
            return cache.get(n);
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        int i = tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
        cache.put(n, i);
        return i;
    }
}
