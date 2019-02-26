package offer;

/**
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 */
public class offer5502 {

    public boolean isBalanced = true;

    public boolean IsBalanced_Solution(TreeNode root) {
        height(root);
        return isBalanced;

    }

    public int height(TreeNode root){
        if(root == null){
            return 0;
        }

        int left = height(root.left)+1;
        int right = height(root.right)+1;

        if(Math.abs(left-right)>=1){
            isBalanced = false;
        }

        return Math.max(left,right);

    }
}
