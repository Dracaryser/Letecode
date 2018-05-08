package medium;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
	public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        backTrack(list, new ArrayList(), nums);
        return list;
        
      
    }
	 public void backTrack(List<List<Integer>> list, List<Integer> tempList, int[] nums){
      	if(tempList.size() == nums.length){
      		list.add(tempList);
      	}
      	for(int i=0; i<nums.length; i++){
      	 	if(tempList.contains(nums[i])) continue;
      	 	tempList.add(nums[i]);
      	 	backTrack(list,tempList,nums);
      	 	tempList.remove(tempList.size()-1);
      	}
     
     }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
