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

// Brute Force Approach:
// Use extra space by creating a new linked list.
// Time Complexity: O(N)
// Space Complexity: O(N)

// class Solution {
//     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//         ListNode prev=new ListNode(0,null);
//         ListNode dummy=prev;
//         while(list1!=null && list2!=null){
//             if(list1.val<list2.val){
//                 ListNode temp=new ListNode(list1.val,list1.next);
//                 prev.next=temp;
//                 prev=temp;
//                 list1=list1.next;
//             }
//             else{
//                ListNode temp=new ListNode(list2.val,list2.next);
//                 prev.next=temp;
//                 prev=temp;
//                 list2=list2.next;
//             }
//         }
//         while(list1!=null){
//               ListNode temp=new ListNode(list1.val,list1.next);
//                 prev.next=temp;
//                 prev=temp;
//                 list1=list1.next;
//         }
//         while(list2!=null){
//             ListNode temp=new ListNode(list2.val,list2.next);
//                 prev.next=temp;
//                 prev=temp;
//                 list2=list2.next;
//         }
//         return dummy.next;
//     }
// }


// Optimised Approach:
// Without using extra space
// Time complexity O(N) and Space complexity O(1)

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null)return list2;
        if(list2==null)return list1;
       
        if(list1.val>list2.val){
            ListNode temp=list1;
            list1=list2;
            list2=temp;
        }
        ListNode dummy=list1;
        while(list1!=null && list2!=null){
            ListNode temp=null;
            while(list1!=null && list2!=null && list1.val<=list2.val){
                temp=list1;
                list1=list1.next;
            }
            temp.next=list2;
             ListNode tempp=list1;
            list1=list2;
            list2=tempp;
        }
        return dummy;
        
    }
}