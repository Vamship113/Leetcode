class Solution {
    public int possibleStringCount(String word) {
        int count=1;
        int len=word.length();
        int i=0;
        while(i<len-1){
            int freq=0; // not including itself
            while(i<len-1 && word.charAt(i)==word.charAt(i+1)){
                i++;
                freq++;
            }
            count+=freq;
            i++;
        }
        return count;
    }
}


/*
"aaaabababa"
3+01

*/