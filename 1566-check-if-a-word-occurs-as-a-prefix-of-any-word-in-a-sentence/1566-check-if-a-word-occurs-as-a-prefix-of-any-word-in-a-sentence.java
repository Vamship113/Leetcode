// class Solution {
//     public int isPrefixOfWord(String sentence, String searchWord) {
//         int k=searchWord.length(),l=sentence.length();
//         String test="";
//         int loc=1;
//         int i=0;
//         while(i<l){
//             char c=sentence.charAt(i);
//             if(c!=' ') {
//                 test+=c;
//                 if(test.length()==k && test.equals(searchWord)) return loc;
//             }
//             else{
//                 loc++;
//                 test="";
//             }
//             i++;
//         }
//     return -1;
//     }
// }
class Solution {
    public int isPrefixOfWord(String sentence, String searchWord){
        String[] arr = sentence.split(" ");
        for(int i=0;i<arr.length;i++){
            if(arr[i].startsWith(searchWord)){
                return i+1;
            }
        }
        return -1;
    }
}