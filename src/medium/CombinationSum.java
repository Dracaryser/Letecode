package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(candidates);
        backTracking(lists, new ArrayList<>(),candidates, target,0);
        return lists;
    }
	
	public void backTracking(List<List<Integer>> lists, List templist, int[] nums , int remain ,int start){
		if(remain < 0) return;
		else if(remain == 0) lists.add(new ArrayList(templist));
		else {
			for(int i=start ; i<nums.length; i++){
				templist.add(nums[i]);
				backTracking(lists,templist, nums, remain-nums[i],i);
				templist.remove(templist.size()-1);
			}
		}
	}
	public static void main(String[] args) {
		int[] a = {2,3,4,7};
		System.out.println(new CombinationSum().combinationSum(a, 7));

	}

}
