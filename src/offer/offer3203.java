package offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
 */
public class offer3203 {

    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);
        int count = 0;
        while (!queue.isEmpty()){
            ArrayList<Integer> temp = new ArrayList<>();

            int size = queue.size();
            while (size-- > 0){
                TreeNode node = queue.poll();
                if(node == null){
                    continue;
                }
                temp.add(node.val);
                queue.add(node.left);
                queue.add(node.right);
            }
            if(count%2==1){
                Collections.reverse(temp);
            }
            count++;
            if(temp.size()!=0){
                ans.add(temp);
            }
        }

        return ans;
    }
}
