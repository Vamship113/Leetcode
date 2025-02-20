class Solution {
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<nums.length;i++){
            char c=nums[i].charAt(i);
            ans.append(c== '0' ? '1' : '0');
        }
        return ans.toString();
    }
    // int integer(String binary){
    //     int num= 0;
    //     int rise=0;
    //     for(int i=binary.length()-1;i>=0;i--){
    //         char c= binary.charAt(i);
    //         if(c=='1') num+=(int)Math.pow(2,rise++);
    //     }
    //     return num;
    // }

}