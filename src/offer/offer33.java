package offer;

/**
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 */
public class offer33 {


    /**
     * 二叉查找树后序遍历中最后一位为root，比root小的为左子树，比root大的为右子树
     * @param sequence
     * @return
     */
    public boolean VerifySquenceOfBST(int [] sequence) {

        if(sequence.length == 0){
            return false;
        }
        int n = sequence.length-1;
        return verify(sequence,0,n);
    }

    public boolean verify(int[] sequence,int first, int last){
        if(last-first <= 1){
            return true;
        }
        int root = sequence[last];
        int index = first;
        while (index<last && sequence[index]<= root){
            index ++;
        }
        for(int i = index;i<last;i++){
            if(sequence[i]<root){
                return false;
            }
        }
        return verify(sequence,first,index-1) && verify(sequence,index,last-1);
    }
}
