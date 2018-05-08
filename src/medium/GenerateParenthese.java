package medium;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthese {
	public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        backTracking(list,"",0,0,n);
        return list;
        
        
    }
	public void backTracking(List<String> l,String s, int open, int end, int max){
    	if(s.length() == max*2){
    		l.add(s);
    	}
    	if(open < max) {
    		backTracking(l,s+"(",open+1,end,max);
    	}
    	if(end < open) {
    		backTracking(l,s+")",open,end+1,max);
    	}
    }
	public static void main(String[] args) {
		System.out.println(new GenerateParenthese().generateParenthesis(3));

	}

}
