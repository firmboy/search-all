package com.playboy.leetcode.linked;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author playboy
 * @create 2020-08-17 7:12 下午
 * @description 876
 * @serviceLogic https://leetcode-cn.com/problems/middle-of-the-linked-list/
 **/
public class LinkedTest7 {
    private static final Logger log = LoggerFactory.getLogger(LinkedTest7.class);

    public static ListNode middleNode(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        if (head.next.next == null) {
            return head.next;
        }
        ListNode fast = head;
        ListNode slow = head;

        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        if (fast.next != null) {
            slow = slow.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        //head.next.next.next = head.next;
        ListNode node = middleNode(head);
        System.out.println(node);

    }

}
