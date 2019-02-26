package offer;

/**
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 */
public class offer39 {

    /**
     * 使用 count 来统计一个元素出现的次数，当遍历到的元素和统计元素相等时，令 count++，否则令 count--。如果前面查找了 i 个元素，且 count == 0，说明前 i 个元素没有 ans，或者有 ans，但是出现的次数少于 i / 2 ，因为如果多于 i / 2 的话 count 就一定不会为 0 。此时剩下的 n - i 个元素中，ans 的数目依然多于 (n - i) / 2，因此继续查找就能找出 ans。
     * @param array
     * @return
     */
    public int MoreThanHalfNum_Solution(int [] array) {

        int sum = array.length;
        int count = 1;
        int ans = array[0];
        for(int i = 1;i<sum;i++){
            if(count == 0){
                ans = array[i];
                count = 1;
            }
            else if(array[i] != array[i-1]){
                count--;
            }else {
                ans = array[i];
                count++;
            }
        }

        int num = 0;
        for(int i : array){
            if(i == ans){
                num++;
            }
        }
        if(num>sum/2){
            return ans;
        }else {
            return 0;
        }


    }
}
