package offer;

public class offer1802 {

    public ListNode deleteDuplication(ListNode pHead) {
        if(pHead == null || pHead.next == null){
            return pHead;
        }

        ListNode cur = pHead.next;
        ListNode pre = pHead;
        if(cur.next == null){
            return cur;
        }
        while(cur != null){

            boolean flag = false;
            if(cur.val == pre.val && cur.next !=null){
                ListNode next = cur.next;
                pre.next = next;
                cur = next;
                flag = true;
            }
            if(cur.val != pre.val && flag == true){
                flag = false;
                pre.next = cur.next;
                cur = pre.next;
            }
            if(cur.val != pre.val && flag == false){

                cur = cur.next;
            }
        }
        return pHead;
    }
}
