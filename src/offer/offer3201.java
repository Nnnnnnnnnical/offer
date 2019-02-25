package offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 */
public class offer3201 {

    /**
     * 用队列来存储根节点
     * @param root
     * @return
     */

//    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
//        ArrayList<Integer> ans = new ArrayList<>();
//        Queue<TreeNode> queue = new LinkedList<>();
//        if(root == null){
//            return ans;
//        }
//        queue.add(root);
//        while (!queue.isEmpty()){
//            TreeNode temp = queue.poll();
//            ans.add(temp.val);
//            if(temp.left == null && temp.right == null){
//                continue;
//            }else if(temp.left == null){
//                queue.add(temp.right);
//            }else if (temp.right == null){
//                queue.add(temp.left);
//            }else {
//                queue.add(temp.left);
//                queue.add(temp.right);
//            }
//        }
//        return ans;
//    }


    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode temp = queue.poll();
            if(temp == null){
                continue;
            }
            ans.add(temp.val);
            queue.add(temp.left);
            queue.add(temp.right);
        }
        return ans;
    }

}
