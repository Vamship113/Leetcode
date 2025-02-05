class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        char[] set= new char[4];
        int count=0;
        int l=s1.length();
        int ind=0;
        for(int i=0;i<l;i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                count++;
                if(count >2) return false;
                set[ind++]=s1.charAt(i);
                set[ind++]=s2.charAt(i);
            }
        }
        if(count==0) return true;
        return (set[0]==set[3] && set[1]==set[2]);
    }
}