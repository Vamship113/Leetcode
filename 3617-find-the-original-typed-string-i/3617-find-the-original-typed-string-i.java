class Solution {
    public int possibleStringCount(String word) {
        int count=1;
        int n=word.length();
        for(int i=0;i<n-1;i++){
            if(word.charAt(i)==word.charAt(i+1)) count++;
        }
        return count;
    }
}


/*
"aaaabababa"
3+01

*/