class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] ans= new int[queries.length];
        int[] presum = new int[words.length];
        int i=0,v=0;
        for(String word : words){
            if(isValid(word))
            presum[i++]=++v;
            else
            presum[i++]=v;
        }
        int ind=0;
        for(int j=0;j<queries.length;j++){
            int start=queries[j][0];
            int end = queries[j][1];
            if(start == 0 ) 
            ans[ind++]=presum[end];
            else if(start==end){
                if(isValid(words[start]))
                ans[ind++]=presum[end]-presum[end-1];
                else
                ans[ind++]=0;
            }
            else
            ans[ind++]=presum[end]-presum[start-1];
        }
        return ans;
        
    }
    boolean isValid(String s){
        if(isVowel(s.charAt(0)) && isVowel(s.charAt(s.length()-1))) return true;
        return false;
    }
    boolean isVowel(char c){
        if(c=='a' || c=='e' || c=='i'|| c=='o' || c=='u') return true;
        return false;
    }
}