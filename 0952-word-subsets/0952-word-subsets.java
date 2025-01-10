class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
    List<String> output= new ArrayList<>();
        int[] max_freq = new int[26];
        Arrays.fill(max_freq,0);
        for(String word: words2){
            int[] freq=count(word);
            for(int i=0;i<26;i++)
            max_freq[i]=Math.max(freq[i],max_freq[i]);
        }
        for(String word: words1){
            int[] freq=count(word);
            if(equal( max_freq,freq)) output.add(word);
            
        }
        return output;
        
    }


    int[] count(String s){
        int[] t = new int[26];
        for(int i=0;i<s.length();i++)
        t[s.charAt(i)-'a']++;
        return t;
    }
    boolean equal(int[] subset, int[] set){
        for(int i=0;i<26;i++) {
        	if(subset[i]>set[i]) return false;
        }
        return true;
    }
}