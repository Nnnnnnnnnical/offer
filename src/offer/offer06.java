package offer;


import java.util.ArrayList;
import java.util.Stack;

/**
 * 从尾到头反过来打印出每个结点的值。
 */
public class offer06 {

//    /**
//     * 头插法
//     * @param listNode
//     * @return
//     */
//    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
//        ListNode newHead = new ListNode(-1);
//        while (listNode != null){
//            ListNode next = listNode.next;
//            listNode.next = newHead.next;
//            newHead.next = listNode;
//            listNode = next;
//        }
//        newHead = newHead.next;
//        ArrayList<Integer> ans = new ArrayList<>();
//        while(newHead!=null){
//            ans.add(newHead.val);
//            newHead = newHead.next;
//        }
//        return ans;
//    }

    /**
     * 栈存储
     * @param listNode
     * @return
     */
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        while(listNode!=null){
            stack.add(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while(!stack.isEmpty()){
            ans.add(stack.pop());
        }
        return ans;
    }
}
