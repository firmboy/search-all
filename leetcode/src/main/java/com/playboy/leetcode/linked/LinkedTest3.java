package com.playboy.leetcode.linked;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author playboy
 * @create 2020-07-17 6:40 下午
 * @description
 * @serviceLogic 21
 **/
public class LinkedTest3 {
    private static final Logger log = LoggerFactory.getLogger(LinkedTest3.class);


    /**
     * 迭代
     *
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode node = head;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                node.next = l1;
                l1 = l1.next;
            } else {
                node.next = l2;
                l2 = l2.next;
            }
            node = node.next;
        }
        if (l1 == null) {
            node.next = l2;
        } else {
            node.next = l1;
        }

        return head.next;
    }

    /**
     * 递归
     *
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode node = mergeTwoLists(l1, l2);
        System.out.println(node);
    }


}
