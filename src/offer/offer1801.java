package offer;

/**
 * 在 O(1) 时间内删除链表节点
 */
public class offer1801 {

    /**
     * 如果要删除节点不是最后一个节点，那么把要删除的节点赋值为下一个节点的值，并指向下下一个节点，复杂度为o1；如果是最后一个节点，那么要遍历整个链表，当等于要删除节点时，置为null，复杂度为on
     * @param head
     * @param delNode
     * @return
     */
    public ListNode  delNode(ListNode head, ListNode delNode) {
        if(head == null || delNode == null){
            return null;
        }

        if(delNode.next != null){
            ListNode next = delNode.next;
            delNode.val = next.val;
            delNode.next = next.next;
        }else {
            ListNode cur = head;
            while(cur.next != delNode){
                cur = cur .next;
            }
            cur = null;
        }
        return head;
    }

}
