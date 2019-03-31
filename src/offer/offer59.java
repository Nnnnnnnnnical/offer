package offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，那么一共存在6个滑动窗口，他们的最大值分别为{4,4,6,6,6,5}； 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个： {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}， {2,3,[4,2,6],2,5,1}， {2,3,4,[2,6,2],5,1}， {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}
 */
public class offer59 {


    public static void main(String[] args){
        int[] num = {2,3,4,2,6,2,5,1};
        ArrayList<Integer> ans = maxInWindows(num,3);
        for(int i = 0;i<ans.size();i++){
            System.out.println(ans.get(i)+ "  ");
        }
    }

    public static ArrayList<Integer> maxInWindows(int [] num, int size) {

        if(num.length==0 || size == 0 || num.length<size){
            return new ArrayList<>();
        }

        ArrayList<Integer> ans = new ArrayList<>();
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1,o2)->o2-o1);
        for(int i = 0;i<size;i++){
            queue.add(num[i]);
        }
        ans.add(queue.peek());

        for(int i = 0, j = i + size; j < num.length; i++, j++){
            queue.remove(num[i]);
            queue.add(num[j]);
            ans.add(queue.peek());
        }

        return ans;
    }

}
