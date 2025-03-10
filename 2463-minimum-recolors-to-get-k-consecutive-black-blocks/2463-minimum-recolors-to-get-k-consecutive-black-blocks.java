class Solution {
    public int minimumRecolors(String blocks, int k) {
        int black=0,white=0;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W') white++;
            else black++;
        }
        int m=Integer.MAX_VALUE;
        int last=0;
        for(int i=k;i<blocks.length();i++){
            if(black==k) return 0;
            if(black+white==k) m = Math.min(m, white);
            if(blocks.charAt(last)=='W') white--;
            else black--;
            last++;
            if(blocks.charAt(i)=='W') white++;
            else black++;
        }
        if(black==k) return 0;
        if(black+white==k) m = Math.min(m, white);
        return m;
    }
}