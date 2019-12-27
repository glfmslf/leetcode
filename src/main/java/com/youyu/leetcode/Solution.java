package com.youyu.leetcode;

/**
 * @author: youyu  工号：1552
 * CREATED_DATE: 2019/5/30 16:46
 */
public class Solution {
    public static ListNode  addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        ListNode p = l1;
        ListNode q = l2;
        ListNode curr = listNode;
        int temp = 0;
        while (p != null || q != null){
            int a = p != null ? p.val : 0;
            int b = q != null ? q.val : 0;
            int sum = temp + a + b;
            temp = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null){
                p = p.next;
            }
            if (q != null){
                q = q.next;
            }
        }
        if (temp > 0){
            curr.next = new ListNode(temp);
        }

        return listNode.next;
    }

    public static void main(String[] args) {
//        ListNode p1 = new ListNode(5);
//        p1.next = new ListNode(4);
//        p1.next.next = new ListNode(3);

        ListNode p1 = new ListNode(1);
        p1.next = new ListNode(8);

        ListNode p2 = new ListNode(0);
//        p2.next = new ListNode(6);
//        p2.next.next = new ListNode(4);

        ListNode result = addTwoNumbers(p1,p2);
        while (result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }
}
