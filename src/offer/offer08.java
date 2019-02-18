package offer;

/**
 * 给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 */
public class offer08 {

    /**
     * 1.首先判断右孩子是不是空，如果不是，那么下一个结点为右孩子的最左孩子
     * 2.如果右孩子是空，还是父节点的右孩子，那么下一个结点为一直向上遍历父节点找到一个父节点的左子节点，那么它的父节点为所求，否则为最后孩子，没有下一个结点
     */
    public TreeLinkNode GetNext(TreeLinkNode pNode){

        if(pNode.right != null) {
            TreeLinkNode rChild = pNode.right;
            while (rChild.left != null) {
                rChild = rChild.left;
            }
            return rChild;

        }else {
            while(pNode.next != null){
                TreeLinkNode pre = pNode.next;
                if(pre.left == pNode){
                    return pre;
                }
                pNode = pNode.next;
            }
            return null;
        }

    }
}
