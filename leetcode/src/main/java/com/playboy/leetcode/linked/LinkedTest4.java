package com.playboy.leetcode.linked;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author playboy
 * @create 2020-08-15 6:20 下午
 * @description 反转链表 https://leetcode-cn.com/problems/reverse-linked-list/
 * @serviceLogic
 **/
public class LinkedTest4 {
    private static final Logger log = LoggerFactory.getLogger(LinkedTest4.class);


    public static void main(String[] args) {
        LinkedTest4 linkedTest4 = new LinkedTest4();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        ListNode node = linkedTest4.reverseList(head);
        System.out.println(node);
    }


    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode node = head;
        ListNode pre = null;

        return re(node, pre);
    }

    /**
     * 递归公式
     *
     * @param node
     * @param pre
     */
    public ListNode re(ListNode node, ListNode pre) {
        if (node == null) {
            return pre;
        }
        ListNode temp = node.next;
        node.next = pre;
        return re(temp, node);
    }


    /**
     * 迭代思路
     *
     * @param head
     * @return
     */
    public ListNode reverseList1(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode node = head;
        ListNode pre = null;
        while (node != null) {
            ListNode next = node.next;
            node.next = pre;
            pre = node;
            node = next;
        }
        return pre;
    }


}
