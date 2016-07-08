package leetcode;

public class RemvoeDuplicates {

	public int removeDuplicates(int[] nums) {
		if(nums==null)
			return 0;
        int x=nums[0];
        int length=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=x){
                nums[length]=nums[i];
                length++;
                x=nums[i];
            }
        }
        return length;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]={0,1,2,3,4,4,5};
		System.out.println(new RemvoeDuplicates().removeDuplicates(nums));
	}

}
