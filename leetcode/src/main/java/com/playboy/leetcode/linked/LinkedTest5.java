package com.playboy.leetcode.linked;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author playboy
 * @create 2020-08-15 7:11 下午
 * @description 判断链表中是否有环
 * @serviceLogic
 **/
public class LinkedTest5 {
    private static final Logger log = LoggerFactory.getLogger(LinkedTest5.class);


    public static void main(String[] args) {
        LinkedTest5 lisnedTest5 = new LinkedTest5();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = head.next;
        boolean b = lisnedTest5.hasCycle(head);
        System.out.println(b);
    }


    public boolean hasCycle(ListNode head) {
        ListNode prv1 = head;
        ListNode prv2 = head;
        do {
            if (prv2 == null || prv2.next == null || prv2.next.next == null) {
                return false;
            }
            prv2 = prv2.next.next;
            prv1 = prv1.next;
        } while (!prv1.equals(prv2));
        return true;
    }
}
