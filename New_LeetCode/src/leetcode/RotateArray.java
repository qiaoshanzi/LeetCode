package leetcode;

public class RotateArray {

	public void rotate(int[] nums, int k) {
		int n = nums.length;
		int temp;
		k = k % n;
		for (int i = 0; i < n / 2; i++) {
			temp = nums[i];
			nums[i] = nums[n - 1 - i];
			nums[n - 1 - i] = temp;
		}
		for (int i = 0; i < k / 2; i++) {
			temp = nums[i];
			nums[i] = nums[k - 1 - i];
			nums[k - 1 - i] = temp;
		}
		for (int i = 0; i < (n - k) / 2; i++) {
			temp = nums[k + i];
			nums[k + i] = nums[n - 1 - i];
			nums[n - 1 - i] = temp;
		}
	}

	public void rotate1(int[] nums, int k) {
		int n = nums.length;
		k = k % n;
		reverse(nums, 0, n - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, n - 1);
	}

	private void reverse(int[] nums, int s, int e) {
		int temp;
		while (s < e) {
			temp = nums[s];
			nums[s] = nums[e];
			nums[e] = temp;
			s++;
			e--;
		}
	}

	private void reverse1(int[] nums, int m, int n) {
		while (m < n) {
			nums[m] ^= nums[n];
			nums[n] ^= nums[m];
			nums[m] ^= nums[n];
			m++;
			n--;
		}
	}
//https://leetcode.com/discuss/28501/my-c-solution-o-n-time-%26%26-o-1-space
	public void rotate2(int[] nums, int k) {
		int n = nums.length;
		k = k % n;
		int i = 0;
		int nowIndex = 0, tmp1, tmp2 = nums[0];
		for (int j = 0; j < n; j++) {
			tmp1 = tmp2;
			nowIndex = (nowIndex + k) % n;
			tmp2 = nums[nowIndex];
			nums[nowIndex] = tmp1;
			if (nowIndex == i && i < n - 1) {
				i++;
				nowIndex = i;
				tmp2 = nums[nowIndex];
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8 };
		new RotateArray().rotate2(nums, 2);
		for (int a : nums)
			System.out.println(a);
	}

}
