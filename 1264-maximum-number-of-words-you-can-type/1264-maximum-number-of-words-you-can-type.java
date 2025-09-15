class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int[] arr= new int[26];
        for(char c: brokenLetters.toCharArray()){
            arr[c-'a']++;
        }
        int count=0;
        boolean found=false;
        for(char c: text.toCharArray()){
            if (!found & c!=' ')
           { 
            if(arr[c-'a']!=0) found =true;
           }
           if(c==' '){
            if(!found) count++;
            found=false;
           }
        }
        if(!found) return ++count;
        return count;
    }
}