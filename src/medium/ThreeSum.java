package medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> lists = new LinkedList();
		for(int i=0; i<nums.length-2; i++){
			if(i == 0 || i>0 && nums[i] != nums[i-1]){
				int lo = i+1; int hi = nums.length-1; int sum = 0 - nums[i];
				while(lo < hi){
					if(nums[lo] + nums[hi] == sum){
						lists.add(Arrays.asList(nums[lo],nums[i],nums[hi]));
						while(lo<hi && nums[lo] == nums[lo+1]) lo++;
						while(lo<hi && nums[hi] == nums[hi-1]) hi--;
						lo++;
						hi--;
					}else if(nums[lo]+nums[hi] < sum) {			
						lo++;
					}else{
						hi--;
					}
				}
			}
		}
		return lists;
    }
	public static void main(String[] args) {
		int[] a = {-1,0,1,-1,2};
		List<List<Integer>> lists = new ThreeSum().threeSum(a);
		for(int i=0; i<lists.size(); i++){
			System.out.println(lists.get(i));
		}
	}
}
