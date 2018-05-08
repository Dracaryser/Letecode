package medium;

public class NextPermutation {
	public void nextPermutation(int[] nums){
		int i = nums.length - 2;
		while(i>=0 && nums[i+1] <= nums[i]){
			i--;
		}
		if(i>= 0){
			int j = nums.length-1;
			while(j>=0 && nums[j] <= nums[i]){
				j--;
			}
			swag(nums,i,j);
		}
		reverse(nums,i+1);
	}
	
	public void reverse(int[] nums, int start){
		int i = start; int j = nums.length - 1;
		while(i < j){
			swag(nums,i,j);
			i++;
			j--;
		}
	}
	public void swag(int[] nums,int i, int j){	
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
	}

	public static void main(String[] args) {
		int [] a = {1,2,3};
		new NextPermutation().nextPermutation(a);
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]);
		}
	}

}
