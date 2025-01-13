class Solution {
    public int minimumLength(String s) {
        int n=s.length();
        if(n<3) return n;
        int[] store= new int[26];
        for(int i=0;i<n;i++){
            store[s.charAt(i)-'a']++;
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(store[i]==0) continue;
            if(store[i]%2==0) count+=2;
            else count++;
        }
        return count;
    }
}