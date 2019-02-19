package offer;

/**
 *  合并两个排序的链表
 */
public class offer25 {

    /**
     * 迭代法
     * @param list1
     * @param list2
     * @return
     */
//    public ListNode Merge(ListNode list1,ListNode list2) {
//
//        ListNode newHead = new ListNode(-1);
//        ListNode cur = newHead;
//
//        while(list1 != null && list2 != null){
//            if(list1.val > list2.val){
//                cur.next = list2;
//                list2 = list2.next;
//            }else {
//                cur.next = list1;
//                list1 = list1.next;
//            }
//            cur = cur.next;
//        }
//
//        if(list1 == null){
//            cur.next = list2;
//        }else {
//            cur.next = list1;
//        }
//        return newHead.next;
//    }

    /**
     * 递归法
     * @param list1
     * @param list2
     * @return
     */
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }

        if(list1.val <= list2.val){
            list1.next = Merge(list1.next,list2);
            return list1;
        }else {
            list2.next = Merge(list2.next,list1);
            return list2;
        }
    }

}
