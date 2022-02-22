public class DeleteMiddleNode {
    /*Delete Middle Node: Implement an algorithm to delete a node in the middle (i.e., any node but
the first and last node, not necessarily the exact middle) of a singly linked list, given only access to
that node. */

    public static void main(String[] args){
        LinkedList head=new LinkedList(1);
        head.next=new LinkedList(2);
        head.next.next=new LinkedList(3);
        head.next.next.next=new LinkedList(4);
        head.next.next.next.next=new LinkedList(5);

        LinkedList result=removeNode(head);

        while(result!=null){
            System.out.println(result.data);
            result=result.next;
        }
    }
    public static LinkedList removeNode(LinkedList head){
        LinkedList fast=head;
        LinkedList slow=head;
        LinkedList prev=null;
        while(fast.next!=null){
            fast=fast.next.next;
            prev=slow;
            slow=slow.next;
        }
        prev.next=prev.next.next;
        return head;
    }

    static class LinkedList{
        LinkedList next;
        int data;
        public LinkedList(int data){
            this.data=data;
        }
    }
}
