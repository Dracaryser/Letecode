package easy;

public class Search {
	public int searchInsert(int[] nums, int target) {
		int k = 0;
	    for(int i=0; i<nums.length; i++){    
	    	if(nums[i]<target){
	    		k++;
	    	}else if(nums[i]==target){
	    		k = i;
	    	}
	    }
	    return k;
    }
	public static void main(String[] args) {
		int[] a = {1,2,4,5};
		int s = 3;
		System.out.println(new Search().searchInsert(a, s));
	}

}
