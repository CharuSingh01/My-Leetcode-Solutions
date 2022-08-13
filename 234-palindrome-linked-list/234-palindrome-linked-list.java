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

// One approach is to use recursion

// class Solution {
//     public boolean isPalindrome(ListNode head) {
//       if(head==null)return true;
//       temp=head;
//       boolean ans=solution(head);
//         return ans;
        
//     }
//     ListNode temp;
//     public boolean solution(ListNode right){
//          if(right==null){
//             return true;
//         }
//         boolean check=solution(right.next);
//         if(check==false)return false;
//         else if(temp.val!=right.val){
//        return false;
//         }
//         else{
//         temp=temp.next;
//         return true;
//         }
//     }
// }

class Solution {
    public ListNode middle(ListNode head){
        if(head==null || head.next==null)return head;
         ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean isPalindrome(ListNode head) {
         if(head==null || head.next==null)return true;
       ListNode slow=middle(head);
       ListNode newHead=slow.next;
        slow.next=null;
        ListNode temp=reverse(newHead);
        boolean result=true;
        while(temp!=null){
            if(temp.val!=head.val){
                result=false;
                break;
            }
            temp=temp.next;
            head=head.next;
        }
        return result;
    }
    public ListNode reverse(ListNode head){
         if(head==null || head.next==null )return head;
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode currNext=curr.next;
            curr.next=prev;
            prev=curr;
            curr=currNext;
        }
        return prev;
    }
}