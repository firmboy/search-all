package com.playboy.leetcode.order;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author playboy
 * @create 2020-08-23 4:47 下午
 * @description 插入排序
 * @serviceLogic
 **/
public class InsertSort {
    private static final Logger log = LoggerFactory.getLogger(InsertSort.class);

    public static void main(String[] args) {
        int[] ints = insertSortA(new int[]{3, 5, 4, 1, 2, 6});
        System.out.println("hwhw");
    }

    public static int[] insertSortA(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int value = arr[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (arr[j] > value) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = value;
        }
        return arr;
    }

    public static int[] insertSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int temp = i;
            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j]) {
                    temp = j;
                    break;
                }
            }
            if (temp != i) {
                int tempA = arr[i];
                for (int k = i - 1; k >= temp; k--) {
                    arr[k + 1] = arr[k];
                }
                arr[temp] = tempA;
            }
        }
        return arr;
    }
}
