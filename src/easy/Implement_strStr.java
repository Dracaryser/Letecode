package easy;

public class Implement_strStr {
	public int strStr(String haystack, String needle) {
        int index = -1;
        if(needle.length()>haystack.length()) return -1;
        if(needle.length() == 0) return 0;
        for(int i=0; i<haystack.length()-needle.length()+1; i++){
        	if(haystack.substring(i, i+needle.length()).equals(needle)){
        		index = i;
                break;
        	} 
        }
        return index;
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ha = "a";
		String ne = "a";
		System.out.println(new Implement_strStr().strStr(ha, ne));
	}

}
