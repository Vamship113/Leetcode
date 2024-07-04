/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode h= new ListNode(0);
        ListNode cur=h;
        int sum=0;
        head=head.next;
        while(head!=null){
            
            if(head.val==0){
                ListNode t=new ListNode(sum);
                cur.next= t;
                sum=0;
                cur=cur.next;
            }
            sum+=head.val;
            head=head.next;
        }
        return h.next;
    }
}