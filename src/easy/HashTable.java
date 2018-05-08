package easy;

import java.util.HashMap;
import java.util.Map;

public class HashTable {
	 public int[] twoSum(int[] nums, int target) {
	    Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	    for(int i=0; i<nums.length; i++) {
	    	int component = target - nums[i];
	    	if(map.containsKey(component)){
	    		return new int[]{map.get(component),i};
	    	}
	    	map.put(nums[i], i);
	    }
	    throw new IllegalArgumentException("No two sum solution");
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
