/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

// Brute Force Approach:
// for every node in list1, check if it is present in list2. As soon as you find a common node, stop. That is the
// inttersection node.
// Time complexity: O(NxM)  (N is length of l1 and M is length of l2)

// Better Approach:
// Store the value and address of list1 in a HashMap and then traverse in list2. As soon as you find a node in
// list2 which is present in map, break. That is the intersection point
// Time complexity: O(N+M)
// Space Complexity: O(N)

// Optimised Approach:
// Find the size of each list and make the starting pointer at equal distance from intersection and 
// traverse the list till the two nodes become equal
// Time complexity: O(N) +O(M) (for size) +O(N-M)

public class Solution {
    public int size(ListNode head){
        int count=0;
        while(head!=null){
            head=head.next;
            count++;
        }
        return count;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int Asize=size(headA);
        int Bsize=size(headB);
        int val=0;
        if(Asize>Bsize){
            val=Asize-Bsize;
            while(val>0){
                headA=headA.next;
                val--;
            }
        }
        else{
            val=Bsize-Asize;
            while(val>0){
                headB=headB.next;
                val--;
            }
        }
        while(headA!=headB){
            headA=headA.next;
            headB=headB.next;
        }
        return headA;
    }
}