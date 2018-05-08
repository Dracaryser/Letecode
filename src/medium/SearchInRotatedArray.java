package medium;

public class SearchInRotatedArray {
	public int search(int[] nums, int target) {
        int i = 0;
        while(i<nums.length-1 && nums[i] < nums[i+1]){
        	i++;
        }
        int k = -1;
        if(target >= nums[0]){
        	for(int j=0; j<=i;j++){
        		if(target == nums[j]){
        			k = j;
        		}
        	}
        }else {
        	for(int j=i+1; j<nums.length; j++){
        		if(target == nums[j])
        			k = j;
        	}
        }
        return k;
    }
	public static void main(String[] args) {
		int[] a = {4,5,6,7,0,1,2};
		System.out.println(new SearchInRotatedArray().search(a, 3));
	}

}
