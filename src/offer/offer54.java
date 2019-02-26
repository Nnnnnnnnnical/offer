package offer;

import java.util.Stack;

/**
 * 给定一棵二叉搜索树，请找出其中的第k小的结点。例如， （5，3，7，2，4，6，8）中，按结点数值大小顺序第三小结点的值为4。
 */
public class offer54 {

    TreeNode KthNode(TreeNode pRoot, int k) {
        if(k == 0){
            return null;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = pRoot;
        while(cur!=null || !stack.isEmpty()){
            while(cur!=null){
                stack.push(cur);
                cur = cur.left;
            }
            TreeNode node = stack.pop();
            k = k-1;
            if(k==0){
                return node;
            }
            cur = node.right;
        }
        return null;
    }
}
