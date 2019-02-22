package offer;

/**
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 */
public class offer27 {
    public void Mirror(TreeNode root) {
        if(root == null){
            return;
        }
        swap(root);
        Mirror(root.left);
        Mirror(root.right);
    }

    public void swap(TreeNode root){
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
}
