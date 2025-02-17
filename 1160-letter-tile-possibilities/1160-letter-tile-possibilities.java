class Solution {
    public int numTilePossibilities(String tiles) {
        int[] freq= new int[26];
        int n=tiles.length();
        for(int i=0;i<n;i++){
            freq[tiles.charAt(i)-'A']++;
        }
        return buildString(freq);
    }
    int buildString(int[] freq){
        int ways=0;
        for(int i=0;i<26;i++){
            if(freq[i]>0){
                freq[i]--;
                ways+=1+buildString(freq);
                freq[i]++;
            }
        }
        return ways;
    }
}