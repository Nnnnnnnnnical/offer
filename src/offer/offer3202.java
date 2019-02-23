package offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
 */
public class offer3202 {

    /**
     * 类比3201
     * @param pRoot
     * @return
     */
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(pRoot);
        while(!queue.isEmpty()){
            ArrayList<Integer> temp = new ArrayList<>();

            int num = queue.size();
            while (num>0){
                TreeNode node = queue.poll();
                if(node == null){
                    num--;
                    continue;
                }
                temp.add(node.val);
                queue.add(node.left);
                queue.add(node.right);
                num--;
            }
            if(temp.size() != 0){
                ans.add(temp);
            }
        }
        return ans;
    }
}
