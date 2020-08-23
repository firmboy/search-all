package com.playboy.leetcode.order;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author playboy
 * @create 2020-08-23 5:23 下午
 * @description 选择排序
 * @serviceLogic
 **/
public class SelectionSort {
    private static final Logger log = LoggerFactory.getLogger(SelectionSort.class);

    public static void main(String[] args) {
        int[] ints = selectionSortA(new int[]{3, 5, 4, 1, 2, 6});
        System.out.println("hwhw");
    }

    public static int[] selectionSortA(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int temp = i;
            for (int j = i; j < n - 1; j++) {
                if (arr[temp] > arr[j + 1]) {
                    temp = j + 1;
                }
            }
            int tempA = arr[temp];
            arr[temp] = arr[i];
            arr[i] = tempA;
        }
        return arr;
    }
}
