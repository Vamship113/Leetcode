class Solution {
    public char kthCharacter(int k) {
        // StringBuilder s = new StringBuilder("a");
        // while(s.length()<k){
        //     int l=s.length();
        //     for(int i=0;i<l;i++)
        //     {
        //         char c = s.charAt(i);
        //         char next = (char)('a' + (c - 'a' + 1) % 26);
        //         s.append(next);
        //     }
        //     //System.out.println(s);
        // }
        // return s.charAt(k-1);

        return (char)('a' + Integer.bitCount(k - 1));
    }
}

/*
ab
ab bc
abbc bccd


*/
