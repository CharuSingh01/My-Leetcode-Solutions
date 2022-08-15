/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node iter=head;
        Node front=head;
        while(iter!=null){
            front=iter.next;
            Node deepCopy=new Node(iter.val);
            iter.next=deepCopy;
            deepCopy.next=front;
            iter=front;
        }
        Node iter2=head;
        while(iter2!=null){
            if(iter2.random!=null){
                iter2.next.random=iter2.random.next;
            }
            iter2=iter2.next.next;
        }
        Node iter3=head;
        Node pseudoHead=new Node(0);
        Node copy=pseudoHead;
        while(iter3!=null){
            Node frontt=iter3.next.next;
            copy.next=iter3.next;
            iter3.next=frontt;
            copy=copy.next;
            iter3=frontt;
        }
        return pseudoHead.next;
    }
}