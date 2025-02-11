class Solution {
    public String removeOccurrences(String s, String part) {
        int n=part.length();
        int[] lps = new int[n];
        Arrays.fill(lps,0);
        computeLPS(lps,part,n);
        StringBuilder sb = new StringBuilder(s);
        removeSubStringOccurance(sb,part,lps);
        return sb.toString();
    }
    void computeLPS(int[] lps, String pattern,int n){
        int i=0,j=1;
        while(j<n){
            if(pattern.charAt(i)==pattern.charAt(j)){
                lps[j]=i+1;
                i++;
                j++;
            }
            else if(i>0){
                i=lps[i-1];
            }
            else{
                j++;
            }
        }
    }
    void removeSubStringOccurance(StringBuilder s,String part,int[] lps){
        int m=s.length();
        int n=part.length();
        int i=0;
        int j=0;
        while(i<m){
            if(s.charAt(i)==part.charAt(j)){
                i++;
                j++;
            }
            if(j==n){
                s.delete(i-n,i);
                m=s.length();
                i=Math.max(0,i-2*n);
                j=0;
            }
            if(i<m && s.charAt(i)!=part.charAt(j)){
                if(j==0) i++;
                else
                j=lps[j-1];
            }
        }
    }
}

