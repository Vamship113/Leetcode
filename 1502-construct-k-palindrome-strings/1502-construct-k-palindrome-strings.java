class Solution {
    public boolean canConstruct(String s, int k) {
        int[] arr= new int[26];
        if(k>s.length()) return false;
        for(char c:s.toCharArray())
        arr[c-'a']++;
        int count=0;
        for(int i=0;i<26;i++)
            if(arr[i]%2!=0) count++;
        return count>k? false:true;
    }
}