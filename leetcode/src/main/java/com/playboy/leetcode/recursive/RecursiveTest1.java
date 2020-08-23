package com.playboy.leetcode.recursive;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author playboy
 * @create 2020-08-20 6:59 下午
 * @description
 * @serviceLogic https://leetcode-cn.com/problems/diving-board-lcci/
 **/
public class RecursiveTest1 {
    private static final Logger log = LoggerFactory.getLogger(RecursiveTest1.class);

    /**
     * @param shorter
     * @param longer
     * @param k
     * @return
     */
    public static int[] divingBoard(int shorter, int longer, int k) {
        if (k == 0) {
            return new int[]{};
        }
        if (k == 1) {
            return new int[]{shorter, longer};
        }
        int[] ints = divingBoard(shorter, longer, k - 1);

        int[] ints1 = new int[ints.length + 1];
        ints1[0] = ints[0] + shorter;
        int i = 0;
        for (; i < ints.length; i++) {
            ints1[i + 1] = ints[i] + longer;
        }
        return ints1;
    }


    public static void main(String[] args) {
        int[] ints = divingBoard(1, 1, 100000);
        for (int anInt : ints) {
            System.out.print(anInt);
        }
    }

}
