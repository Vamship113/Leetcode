class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        while(low<=high){
            if(low>10 && low<100 && low%11==0){
                count++;
            }else if(low>1000 && low<10000){
                int left=low/1000+(low%1000)/100;
                int right=(low%100)/10+low%10;
                if(left==right) count++;
            }
            low++;
        }

        return count;
        //return 1212/1000+(1212%1000)/100;
    }
}