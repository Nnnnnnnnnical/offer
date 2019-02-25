package offer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,
 */
public class offer40 {

    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {

        if(input.length<k){
            return new ArrayList<>();
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1,o2)->o2-o1);

        for(int num:input){
            maxHeap.add(num);
            if(maxHeap.size()>k){
                maxHeap.poll();
            }
        }

        return new ArrayList<>(maxHeap);

    }
}
