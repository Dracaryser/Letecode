package easy;

public class remove_element {
	public int removeElement(int[] nums, int val) {
		int j = 0;
		for(int i=0; i<nums.length; i++){
			if(nums[i] != val){
				nums[j] = nums[i];
				j++;
			}
		}
		return j;

	}
	public static void main(String[] args) {
		int[] a = {3,2,3,2};
		int s = 3;
		int r = new remove_element().removeElement(a, s);
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+" ");
		}
		//System.out.println(r);

	}

}
