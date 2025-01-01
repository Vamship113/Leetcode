class Solution {
    public int maxScore(String s) {
        int r=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') r++;
        }
        int l=0,max=0;
        for(int i=0;i<s.length()-1;i++){
            char n=s.charAt(i);
            if(n=='0') l++;
            else r--;
            max=Math.max(max,l+r);

        }
        return max;
    }
}