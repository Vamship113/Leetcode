// class Solution {
//     public boolean doesValidArrayExist(int[] derived) {
//         int sum=0;
//         for(int num:derived)
//         sum^=num;
//         return sum==0?true:false;
//     }
// }

/*suppose
1 1 0 and original array is 0 1 0
derived is 0^1,1^0,0^0 since every element repeating twice overal sum=0
since we diretly have the values 1  1 0 find 1 ^ 1 ^ 0 = should be zero 
*/

public class Solution {

    public boolean doesValidArrayExist(int[] derived) {
        int sum = 0;
        for (int num : derived) {
            sum += num;
        }
        return sum % 2 == 0;
    }
}