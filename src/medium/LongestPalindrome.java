package medium;

import java.util.HashSet;
import java.util.Set;

public class LongestPalindrome {
	public String longestPalindrome(String s) {
		String ans = null;
		int currLength = 0;
		for(int i=0; i<s.length(); i++){
			if(isPalindrome(s,i-currLength-1,i)){
				ans = s.substring(i-currLength-1,i+1);
				currLength += 2;
			}else if(isPalindrome(s,i-currLength,i)){
				ans = s.substring(i-currLength, i+1);
				currLength += 1;
			}
		}
		return ans;
	}
	
	public boolean isPalindrome(String s, int start, int end){
		if(start < 0) return false;
		while(start < end){
			if(s.charAt(start++) != s.charAt(end--)) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		String s = "abccbass";
		System.out.println(new LongestPalindrome().longestPalindrome(s));
	}
}
