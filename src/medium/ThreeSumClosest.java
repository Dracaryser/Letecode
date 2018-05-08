package medium;

import java.util.Arrays;

public class ThreeSumClosest {
	public int threeSumClosest(int[] nums, int target) {
		int res = nums[0] + nums[1] + nums[nums.length-1];
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2; i++){
        	int lo = i+1;
        	int hi = nums.length-1;
        	while(lo < hi){
                int sum = nums[i] + nums[lo] + nums[hi];
                if(sum == target){
                    res = sum;
                    break;
                }
        		if(sum<target){
        			lo++;    			
        		}else if(sum>target){
        			hi--;      	
        		}
                if(Math.abs(sum-target)<Math.abs(res-target)){
                	res = sum;
                }
        	}
        }
        return res;
    }
	public static void main(String[] args) {
		int[] a = {-1,1,2,1,-4};
		System.out.println(new ThreeSumClosest().threeSumClosest(a, 1));
	}
}
