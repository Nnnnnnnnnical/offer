package offer;

/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。 NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */
public class offer11 {


    public static void main(String[] args){
        int[] arr = new int[]{3,4,5,1,2};
        System.out.println(minNumberInRotateArray(arr));

    }

    /**
     * 因为是旋转数组，所以用mid与最后一个数字相比，如果mid大，那么说明发生了旋转，最小值在后半区，否则最小值在前半区
     * @param array
     * @return
     */
    public static int minNumberInRotateArray(int [] array) {
        int l = 0,r = array.length-1;

        while (l<r){
            int mid = l+(r-l)/2;
            if(array[mid]>array[r]){
                l = mid+1;
            }else {
                r = mid;
            }
        }
        return array[r];
    }

}
