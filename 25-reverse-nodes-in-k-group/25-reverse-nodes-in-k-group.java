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
    public class LinkedList{
        ListNode head;
        ListNode tail;
        int size;
        public int size(){
            return size;
        }
        public void addLast(int val){
            ListNode node=new ListNode(val);
            if(size==0){
                head=tail=node;
                size++;
                return;
            }
            tail.next=node;
            tail=node;
            size++;
            return;
        }
        public void addFirst(int val){
            ListNode node=new ListNode(val);
                 if(size==0){
                head=tail=node;
                size++;
                return;
            }
            node.next=head;
            head=node;
            size++;
            return;
        }
        public int getFirst(){
            if(size==0){
                return -1;
            }
            else{
            return head.val;
            }
        }
        public void removeFirst(){
            if(size==0)return;
            head=head.next;
            size--;
         return;
        }
    }
    public ListNode reverseKGroup(ListNode head, int k) {
      LinkedList list=new LinkedList();
        ListNode temp=head;
        while(temp!=null){
            list.addLast(temp.val);
            temp=temp.next;
        }
        LinkedList prev=new LinkedList();
        while(list.size>0){
            LinkedList curr=new LinkedList();
            if(list.size()>=k){
                for(int i=0;i<k;i++){
                    int vall=list.getFirst();
                    list.removeFirst();;
                    curr.addFirst(vall);
                }
            }
            else{
                int os=list.size();
                for(int i=0;i<os;i++){
                     int vall=list.getFirst();
                    list.removeFirst();;
                    curr.addLast(vall);
                }
            }
            if(prev.size()==0){
                prev=curr;
            }
            else{
                prev.tail.next=curr.head;
                prev.tail=curr.tail;
                prev.size+=curr.size;
            }
        }
        return prev.head;
    }
}