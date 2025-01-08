class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count=0;
        for(int i=0;i<words.length-1;i++){
            boolean flag=false;
            for(int j=i+1; j<words.length;j++){
                if(isPrefixAndSuffix(words[i],words[j])) {
                    flag=true;
                    count++;
                    };
            }
            
        }
        return count;
    }

	boolean isPrefixAndSuffix(String s1,String s2) {
		if(s1.length()>s2.length()) {
            return false;
		}
		int n=s1.length();
		int m=s2.length();
        for(int i=0;i<n;i++){
            if(s1.charAt(i)!=s2.charAt(i)) return false;
        }
        
	    for(int i=n-1;i>-1;i--){
	            if(s1.charAt(i)!=s2.charAt(m-1)) return false;
	            m--;
	        }
    return true;
	}
}