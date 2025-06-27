class Solution {
    public String longestSubsequenceRepeatedK(String s, int k) {
        String res="";
        //to store char freq>=k
        int[] freq= new int[26];
        for(char c: s.toCharArray()){
            freq[c-'a']++;
        }
        //queue for bfs
        Queue<String> q= new LinkedList<>();
        q.offer("");
        while(!q.isEmpty()){
            String cur=q.poll();
            for(char c='a';c<='z';c++){
                if(freq[c-'a']<k) continue;
                String next=cur+c;
                if(countSubSequences(s,next)>=k) {
                    res=next;
                    q.offer(next);
                }
            }
        }

        return res;

    }

    int countSubSequences(String s, String pat){
        // i for s, j for subseq search till j goes out subseq, then increase the count
        //  if char at i!=j  just increment i only 
        int l=pat.length();
        int i=0,j=0;
        int count=0;
        while(i<s.length()){
            //System.out.println(i+" "+j+s.charAt(i)+" "+pat.charAt(i)+" ");
            if(s.charAt(i)==pat.charAt(j)){
                i++;
                j++;
            }
            else{
                i++;
            }
            if(j==l){
                count++;
                j=0;
            }
        }
        return count;
    }

}
/*letsleetcode

bb b
i=0 j=0 0<2
i=1 j=0 1<2

*/