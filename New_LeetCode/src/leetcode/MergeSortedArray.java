package leetcode;

public class MergeSortedArray {
	public void merge(int[] nums1,int m,int[]nums2,int n){
		for(int i=m-1;i>=0;i--){
			nums1[i+n]=nums1[i];
		}
		int i=n,j=0,k=0;
		while(i<n+m&&j<n){
			if(nums1[i]<=nums2[j]){
				nums1[k]=nums1[i];
				i++;
			}else{
				nums1[k]=nums2[j];
				j++;
			}
			k++;
		}
		if(i>=n+m){
			while(k<m+n){
				nums1[k]=nums2[j];
				k++;
				j++;
			}
		}else{
			while(k<m+n){
				nums1[k]=nums1[i];
				i++;
				k++;
			}	
		}
	}
	public void merge1(int[] nums1,int m,int[] nums2,int n){
		int i=m-1,j=n-1,k=m+n-1;
		while(i>=0&&j>=0){
			if(nums1[i]>=nums2[j]){
				nums1[k--]=nums1[i--];
			}else{
				nums1[k--]=nums2[j--];
			}
		}
		while(j>=0){
			nums1[k--]=nums2[j--];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,2,4,5,6,0};
		int b[]={3};
		new MergeSortedArray().merge1(a, 5, b, 1);
		for(int c:a)
			System.out.println(c);
	}

}
