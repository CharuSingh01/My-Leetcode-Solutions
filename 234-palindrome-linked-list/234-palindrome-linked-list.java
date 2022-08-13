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
    public boolean isPalindrome(ListNode head) {
      if(head==null)return true;
      temp=head;
      boolean ans=solution(head);
        return ans;
        
    }
    ListNode temp;
    public boolean solution(ListNode right){
         if(right==null){
            return true;
        }
        boolean check=solution(right.next);
        if(check==false)return false;
        else if(temp.val!=right.val){
       return false;
        }
        else{
        temp=temp.next;
        return true;
        }
    }
}