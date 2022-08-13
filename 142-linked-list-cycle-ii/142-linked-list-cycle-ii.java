/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

// Brute Force Approach:
// Use HashSet to store nodes and as soon you find a node which is already in the HashSet, break the loop.
// Time Complexity: O(N)
// Space Complexity: O(N)

// public class Solution {
//     public ListNode detectCycle(ListNode head) {
//         ListNode answer=null;
//      HashSet<ListNode> set=new HashSet<>();
//         while(head!=null){
//             if(set.contains(head)!=false){
//                 answer=head;
//                 break;
//             }
//             set.add(head);
//             head=head.next;
//         }
//         return answer;
         
//     }
// }

// Optimised Approach:
// use slow and fast pointer method
// find the point of collision and now take two pointers. One at starting point and one at collision point. The place
// where they collide is the answer
// Time Complexity: O(N)
// Space Complexity: O(1)

public class Solution {
      public ListNode detectCycle(ListNode head) {
          if(head==null)return null;
          ListNode answer=null;
          ListNode slow=head;
          ListNode fast=head;
          while(fast.next!=null && fast.next.next!=null){
              slow=slow.next;
              fast=fast.next.next;;
              if(fast==slow){
                  answer=slow;
                  break;
              }
          }
          if(answer==null)return null;
          while(head!=answer){
              head=head.next;
              answer=answer.next;
          }
          return head;
          
      }
}