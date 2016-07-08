package leetcode;

public class RemoveElement {

	public int removeElement(int[] nums, int val) {
        if(nums==null||nums.length==0)
            return 0;
        int length=0;
        for(int x:nums){
            if(x!=val){
                nums[length]=x;
                length++;
            }
        }
        return length;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
