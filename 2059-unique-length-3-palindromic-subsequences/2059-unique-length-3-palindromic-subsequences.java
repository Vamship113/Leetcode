class Solution {
    public int countPalindromicSubsequence(String s) {
        int[] first = new int[26];
        int[] last = new int[26];
        Arrays.fill(first,-1);
        for(int i=0;i<s.length();i++){
            int n=s.charAt(i)-'a';
            if(first[n]==-1) first[n]=i;
            last[n]=i;
        }
        int c=0;
        for(int i=0;i<26;i++){
            Set<Character> set = new HashSet<>();
            int f=first[i],l=last[i];
            for(int k=f+1;k<l;k++){
                set.add(s.charAt(k));
            }
            c+=set.size();
        }
        return c;
    }
}