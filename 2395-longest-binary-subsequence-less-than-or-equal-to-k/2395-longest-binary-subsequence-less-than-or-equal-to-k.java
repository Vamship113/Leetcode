class Solution {
    public int longestSubsequence(String s, int k) {
        int long_subseq=0;
        int len=s.length();
        int power=0;
        int dec=0;
        for(int i=len-1;i>=0;i--){
            char c=s.charAt(i);
            if(c=='0') long_subseq++;
            else if(power<31){
                int add=1<<power;
                if(dec+add<=k){
                    dec+=add;
                    long_subseq++;
                }
            }

            power++;   
        }
        return long_subseq;
    }
}