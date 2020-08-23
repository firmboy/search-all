package com.playboy.leetcode.linked;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author playboy
 * @create 2020-08-17 6:23 下午
 * @description 删除链表的倒数第N个节点
 * @serviceLogic https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/
 **/
public class LinkedTest6 {
    private static final Logger log = LoggerFactory.getLogger(LinkedTest6.class);

    /**
     * 设置快慢节点，最重要的是边界条件，即链表长度为n
     *
     * @param head
     * @param n
     * @return
     */
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        //先设立哨兵节点
        ListNode pre = new ListNode(0);
        pre.next = head;

        //设立快慢节点
        ListNode start = head;
        ListNode end = head;

        while (n > 0) {
            start = start.next;
            n--;
        }

        if (start == null) {
            return pre.next.next;
        }

        while (start.next != null) {
            start = start.next;
            end = end.next;
        }

        end.next = end.next.next;

        return pre.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        //head.next = new ListNode(2);
        //head.next.next = new ListNode(3);
        //head.next.next.next = head.next;
        ListNode node = removeNthFromEnd(head, 1);
        System.out.println(node);
    }
}
