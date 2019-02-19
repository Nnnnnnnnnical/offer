package offer;

/**
 * 输入一个链表，输出该链表中倒数第k个结点
 */
public class offer22 {

    /**
     * 定义两个指针，快指针先走k，慢指针再出发，当快指针遍历完链表后，慢指针为倒数第k个节点；如果k不足，则返回null；
     * @param head
     * @param k
     * @return
     */
    public ListNode FindKthToTail(ListNode head,int k) {

        if(head == null){
            return null;
        }
        ListNode fast = head;
        while (fast!=null && k>0){
            fast = fast.next;
            k--;
        }
        if(k<0){
            return null;
        }
        ListNode slow = head;
        while(fast!=null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

}
