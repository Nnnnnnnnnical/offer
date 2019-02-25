package offer;

import java.util.PriorityQueue;

/**
 * 如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。如果从数据流中读出偶数个数值，那么中位数就是所有数值排序之后中间两个数的平均值。我们使用Insert()方法读取数据流，使用GetMedian()方法获取当前读取数据的中位数。
 */
public class offer4101 {

    /**
     * 求中位数可以将数组分成两部分，左边是都小于中位数的大顶堆，右边是大于中位数的小顶堆，先进入左边，取出最大值（堆顶）放入右边，下次先进入右边，取出最小值（堆顶）放入左边。如果N是奇数，则是在大顶堆的最大值，如果是偶数则是大顶堆和小顶堆堆顶的和的一半
     */
    public PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1,o2)->o2-o1);
    public PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    public int N = 0;


    public void Insert(Integer num) {
        if(N%2==0){
            maxHeap.add(num);
            minHeap.add(maxHeap.poll());
        }else {
            minHeap.add(num);
            maxHeap.add(minHeap.poll());
        }
        N++;
    }

    public Double GetMedian() {
        if(N%2==0){
            return Double.valueOf(maxHeap.peek());
        }else {
            return Double.valueOf((maxHeap.peek()+minHeap.peek())/2);
        }
    }
}
