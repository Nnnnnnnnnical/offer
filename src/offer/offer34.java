package offer;


import java.util.ArrayList;

/**
 * 输入一颗二叉树的跟节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。(注意: 在返回值的list中，数组长度大的数组靠前)
 */
public class offer34 {

    private boolean flag = false;

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        backTracking(ans,temp,root,target);
        return ans;
    }

    private void backTracking(ArrayList<ArrayList<Integer>> ans , ArrayList<Integer> temp , TreeNode root, int target){

        if(root == null && target != 0){
            return;
        }
        if(target == 0 && root == null){
            if(flag){
                ans.add(new ArrayList<>(temp));
            }
            flag = !flag;
        }else {
            temp.add(root.val);
            backTracking(ans,temp,root.left,target-root.val);
            backTracking(ans,temp,root.right,target-root.val);

        }
        temp.remove(temp.size()-1);
    }
}
