package com.playboy.leetcode.order;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author playboy
 * @create 2020-08-23 4:15 下午
 * @description 冒泡排序
 * @serviceLogic
 **/
public class MaoPaoOrder {
    private static final Logger log = LoggerFactory.getLogger(MaoPaoOrder.class);

    public static void main(String[] args) {
        //int[] order = order(new int[]{3, 5, 4, 1, 2, 6});
        int[] order = bubbleSort(new int[]{3, 5, 4, 1, 2, 6});
        System.out.println("hwhw");
    }

    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
        return arr;
    }

    public static int[] order(int[] arr) {
        int i = 0, j = 0;
        for (; i < arr.length; i++) {
            for (j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }


}
