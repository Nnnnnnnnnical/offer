package offer;

/**
 *
 输入两个链表，找出它们的第一个公共结点。
 */
public class offer52 {

    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode temp1 = pHead1;
        ListNode temp2 = pHead2;
        while (temp1!=temp2){

            if(temp1==null){
                temp1 = pHead2;
            }else {
                temp1 = temp1.next;
            }
            if(temp2==null){
                temp2 = pHead1;
            }else {
                temp2 = temp2.next;
            }
        }
        return temp1;
    }

}
