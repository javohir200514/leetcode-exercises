package easy.math.rangesumqueryimmutable_100;

public class NumArray {
    int[] arr;
    public NumArray(int[] nums) {
        this.arr=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            arr[i+1]=arr[i]+nums[i];
        }
    }

    public int sumRange(int left, int right) {
        return arr[right+1]-arr[left];
    }
}
