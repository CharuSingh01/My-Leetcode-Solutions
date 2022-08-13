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



public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode answer=null;
     HashSet<ListNode> set=new HashSet<>();
        while(head!=null){
            if(set.contains(head)!=false){
                answer=head;
                break;
            }
            set.add(head);
            head=head.next;
        }
        return answer;
         
    }
}