class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String pattern = words[i];
            for (int j = 0; j < words.length; j++) {
                if (i != j && words[j].contains(pattern)) {
                    res.add(pattern);
                    break;
                }
            }
        }
        return res;
    }

    	int[] computeLPS(String pattern) {
    	int[] lps= new int[pattern.length()];
    	int i=0,j=1;
    	lps[0] =0;
    	while(j<pattern.length()) {
    		if(pattern.charAt(i)==pattern.charAt(j)) {
    			i++;
    			lps[j]=i;
    			j++;
    		}else {
    			if(i!=0) i=lps[i-1];
    			else {
    				lps[j]=0;
    				j++;
    			}
    		}
    	}
    	return lps;
	}
	
	
	boolean match(String pattern,String text,int[] lps) {
		int i=0,j=0;
    	int n=text.length(),m=pattern.length();
    	while(i<n) {
    		if(text.charAt(i)==pattern.charAt(j)) {
    			i++;
    			j++;
    			if(j==m) {
    				return true;
    			}
    		}
    		else {
    			if(j!=0) j=lps[j-1];
    			else i++;
    		}
    
    	}
    	return false;
	}
}