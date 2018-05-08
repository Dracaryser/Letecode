package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
	public List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> lists = new ArrayList();
		if(nums.length<4) return lists;
		Arrays.sort(nums);	
		for(int i=0;i<nums.length-3; i++){
			if(nums[i]+nums[i+1]+nums[i+2]+nums[i+3]>target) break;
			if(nums[i]+nums[nums.length-3]+nums[nums.length-2]+nums[nums.length-1]<target) continue;
			if(i>0 && nums[i] == nums[i-1]) continue;
			for(int j=i+1; i<nums.length-2; j++){
				if(nums[i] + nums[j] + nums[j+1] + nums[j+2]>target) break;
				if(nums[i] + nums[j] + nums[nums.length-1] + nums[nums.length-2]<target) continue;
				if(j>0 && nums[j] == nums[j-1]) continue;
				int lo = j+1, hi = nums.length-1;
				while(lo < hi){
					int sum = nums[i] + nums[j] + nums[lo] + nums[hi];
					if(sum == target){
						lists.add(Arrays.asList(nums[i],nums[j],nums[lo],nums[hi]));
						while(lo<hi && nums[lo]==nums[lo+1]) lo++;
						while(lo<hi && nums[hi]==nums[hi-1]) hi--;
						lo++;
						hi--;
					}else if(sum < target) lo++;
					else hi--;				
				}		
			}
		}
	return lists;
	}
	public static void main(String[] args) {
		int[] a = {1,0,-1,2,2};
		System.out.print(new FourSum().fourSum(a, 0));
	}
}
