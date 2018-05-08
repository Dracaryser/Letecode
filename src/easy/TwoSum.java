package easy;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
    	
    	int[] ans = new int[2] ;
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[j]+nums[i] == target){
                	ans[0] = i;
                	ans[1] = j;
                }               
            }
        }
        return ans;
    }
	public static void main(String[] args) {
		int[] num = {2,7,11,15}; 
		int target = 9;
		int[] ans = new TwoSum().twoSum(num, target);
		for(int i=0; i<ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
	}

}
