package com.playboy.leetcode.queue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author playboy
 * @create 2020-08-23 3:19 下午
 * @description
 * @serviceLogic https://leetcode-cn.com/problems/hua-dong-chuang-kou-de-zui-da-zhi-lcof/
 **/
public class QueueTest {
    private static final Logger log = LoggerFactory.getLogger(QueueTest.class);

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length + 1 - k];
        Deque<Integer> deque = new LinkedList<>();
        int i = 0;
        for (; i < k; i++) {
            while (!deque.isEmpty() && deque.peekLast() < nums[i]) {
                deque.removeLast();
            }
            deque.addLast(nums[i]);
        }
        result[0] = deque.peekFirst();
        for (; i < nums.length; i++) {
            if (deque.peekFirst() == nums[i - k]) {
                deque.removeFirst();
            }
            while (!deque.isEmpty() && deque.peekLast() < nums[i]) {
                deque.removeLast();
            }
            deque.addLast(nums[i]);
            result[i - k + 1] = deque.peekFirst();
        }

        return result;
    }

    public static void main(String[] args) {
        int[] ints = maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3);
        System.out.println("hehe");
    }


}
