import java.util.HashSet;

public class LoopDetection {
    /*Loop Detection
    * Given a circular linked list, implement an algorithm that returns the node at the beginning of the loop.
DEFINITION Circular linked list: A (corrupt) linked list in which a node's next pointer points to an earlier node, so
as to make a loop in the linked list.
EXAMPLE: Input: A -> B -> C -> D -> E -> C [the same C as earlier] output: C*/

    public static class LinkedList{
        int data;
        LinkedList next;
        public LinkedList(int data){
            this.data=data;
        }

    }
    //Solution is correct but issue with data
    public static void main(String[] args) {
        LinkedList head1 = new LinkedList(1);
        head1.next = new LinkedList(2);
        head1.next.next = new LinkedList(3);
        head1.next.next.next = new LinkedList(4);
        head1.next.next.next.next= new LinkedList(5);
        head1.next.next.next.next.next= new LinkedList(2);

        boolean result=isClosedLoop2(head1);
        System.out.println(result);
    }
    public static boolean isClosedLoop(LinkedList head){
        HashSet<LinkedList> hashSet=new HashSet<>();
        while(head!=null){
            if(hashSet.contains(head)){return true;}
            hashSet.add(head);
            head=head.next;
        }
        return false;
    }
    public static boolean isClosedLoop2(LinkedList head){
        LinkedList slow=head;
        LinkedList fast=head;
        while(slow!=null && fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) {
                return true;
            }
        }
        return false;
    }

}
