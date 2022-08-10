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
// Brute Force:
// Use hashmap to store nodes. if map.containsKey(node)==true , it will be a cycle.
// Time Complexity: O(N) 
// Space Complexity: O(N)

// Optimised Approach:
// Use fast and slow pointer approach
//Time Complexity: O(N)
// Space Complexity: O(1)


public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast)return true;
        }
        return false;
    }
}