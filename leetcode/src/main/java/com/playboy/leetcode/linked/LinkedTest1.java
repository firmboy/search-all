package com.playboy.leetcode.linked;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author playboy
 * @create 2020-07-16 8:11 下午
 * @description
 * @serviceLogic
 **/
public class LinkedTest1 {
    private static final Logger log = LoggerFactory.getLogger(LinkedTest1.class);


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode n1 = l1;
        ListNode n2 = l2;
        boolean flag1 = true;
        boolean flag2 = true;
        ListNode end = n1;
        int temp = 0;
        while (flag1 || flag2) {
            int sum = n1.val + n2.val + temp;
            temp = 0;
            if (sum >= 10) {
                sum = sum - 10;
                temp = 1;
            }
            if (n1.next == null) {
                n1.next = new ListNode(0);
                flag1 = false;
            }
            if (n2.next == null) {
                n2.next = new ListNode(0);
                flag2 = false;
            }
            n1.val = sum;
            end = n1;
            n1 = n1.next;
            n2 = n2.next;
        }
        if (temp != 0) {
            n1.val += temp;
        } else {
            end.next = null;
        }
        return l1;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        //l1.next = new ListNode(4);
        //l1.next.next = new ListNode(9);
        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);

        ListNode node = addTwoNumbers(l1, l2);
        System.out.println(node);
    }

}
