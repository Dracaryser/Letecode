package medium;

public class SearchForRange {
	public int[] searchRange(int[] nums, int target) {
		if(nums.length == 1) return new int[]{0,0};
		int i = 0, j = nums.length - 1, m = -1, n = -1;
		int[] ans = new int[2];
		while(i < j){
			if(nums[i] == target) {
				m = i;
			}
			if(nums[j] == target) {
				n = j;
			}
			if(nums[i] == target && nums[j] == target) break;
			if(nums[i] != target) i++;
			if(nums[j] != target) j--;
			
		}
		ans[0] = m;
		ans[1] = n;
		return ans;
    }
	public static void main(String[] args) {
		int[] a = {5,7,7,8,8,10};
		int[] s = new SearchForRange().searchRange(a, 8);
		for(int i=0; i<s.length; i++){
			System.out.print(s[i]+" ");
		}
	}

}
