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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode prev=new ListNode(0,null);
        ListNode dummy=prev;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                ListNode temp=new ListNode(list1.val,list1.next);
                prev.next=temp;
                prev=temp;
                list1=list1.next;
            }
            else{
               ListNode temp=new ListNode(list2.val,list2.next);
                prev.next=temp;
                prev=temp;
                list2=list2.next;
            }
        }
        while(list1!=null){
              ListNode temp=new ListNode(list1.val,list1.next);
                prev.next=temp;
                prev=temp;
                list1=list1.next;
        }
        while(list2!=null){
            ListNode temp=new ListNode(list2.val,list2.next);
                prev.next=temp;
                prev=temp;
                list2=list2.next;
        }
        return dummy.next;
    }
}