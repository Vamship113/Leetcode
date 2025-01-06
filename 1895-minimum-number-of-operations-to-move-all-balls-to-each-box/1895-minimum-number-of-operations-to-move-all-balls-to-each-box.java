class Solution {
    public int[] minOperations(String boxes) {
        int[] pos = new int[boxes.length()];
        int[] res = new int[boxes.length()];
        int index=0;
        for(int i=0;i<boxes.length();i++){
                if(boxes.charAt(i)=='1') pos[index++] = i;
        }
        int k=0;
        for(int i=0;i<boxes.length();i++){
                int j=0,oper=0;
                while(j<index){
                    if(pos[j]!=i) oper+=Math.abs(pos[j]-i);
                    j++;
                }
                res[k++]=oper;
        }
        return res;

    }
}