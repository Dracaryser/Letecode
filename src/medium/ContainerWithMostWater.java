package medium;

public class ContainerWithMostWater {
	public int maxArea(int[] height) {
		int max = 0;
		int l = 0 , r = height.length -1;
		while(r>l){
			max = Math.max(max, ((r-l)*Math.min(height[r], height[l])));
			if(height[l]<height[r]){
				l++;
			}else {
				r--;
			}
		}
		return max;
    }
	public static void main(String[] args) {
		int[] a = {1,2,2,3,4};
		System.out.println(new ContainerWithMostWater().maxArea(a));

	}

}
