package offer;


import java.util.HashMap;
import java.util.Map;

/**
 * 根据二叉树的前序遍历和中序遍历的结果，重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 */
public class offer07 {

    /**
     * 递归解法（利用map存储中序遍历中的值（k）以及他的索引（v））
     */
    private Map<Integer,Integer> indexForIn = new HashMap<>();

    public TreeNode reConstructBinaryTree(int [] pre, int [] in) {

        for(int i = 0;i<in.length;i++){
            indexForIn.put(in[i],i);
        }

        return reConstructBinaryTree(pre,0,pre.length-1,in,0,in.length-1);

    }

    public TreeNode reConstructBinaryTree(int[] pre,int preL,int preR,int[] in,int inL,int inR){
        if(preL > preR){
            return null;
        }
        TreeNode root = new TreeNode(pre[preL]);
        int index = indexForIn.get(root.val);
        int size = index-inL;
        root.left = reConstructBinaryTree(pre,preL+1,size+preL,in,inL,index-1);
        root.right = reConstructBinaryTree(pre,preL+size+1,preR,in,index+1,inR);

        return root;

    }
}
