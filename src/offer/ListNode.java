package offer;

public class ListNode {

    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }

    private ListNode head;

    // 在链表头添加新的元素e
    public void addFirst(int e){
        ListNode node = new ListNode(e);
        node.next = head;
        head = node;

    }

}
