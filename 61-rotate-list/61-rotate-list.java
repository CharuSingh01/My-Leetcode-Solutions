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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)return null;
        int size=size(head);
        ListNode temp=head;
    
        k=k%size;
            if(k<0){
            k+=size;
        }
        for(int i=0;i<size-k-1;i++){
            temp=temp.next;
        }
    ListNode rpart=temp.next;
        temp.next=null;
        ListNode newrhead=reverse(rpart);
       ListNode newlhead=reverse(head);
        // right ke head ko left ke tail se connect krna hai fir overall reverse
        ListNode tempp=newlhead;
        while(tempp.next!=null){
            tempp=tempp.next;
        }
        tempp.next=newrhead;
        ListNode answer=reverse(newlhead);
        return answer;
    }
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
    public int size(ListNode head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
}