package offer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 输入一个链表，反转链表后，输出新链表的表头。
 */
public class offer24 {
    //头插法
//    public ListNode ReverseList(ListNode head) {
//        ListNode newHead = new ListNode(-1);
//        while (head != null){
//            ListNode next = head.next;
//            head.next = newHead.next;
//            newHead.next = head;
//            head = next;
//        }
//        return newHead.next;
//    }

    //递归法
    public ListNode ReverseList(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }

        ListNode next = head.next;
        head.next = null;
        ListNode newHead = ReverseList(next);
        next.next = head;
        return newHead;
    }
}
