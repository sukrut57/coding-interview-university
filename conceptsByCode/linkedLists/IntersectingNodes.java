import java.util.HashSet;

public class IntersectingNodes {
    /*Intersection: Given two (singly) linked lists, determine if the two lists intersect. Return the intersecting node. Note that the intersection is defined based on reference, not value. That is, if the kth
node of the first linked list is the exact same node (by reference) as the jth node of the second
linked list, then they are intersecting*/
    public static void main(String[] args) {
        LinkedList head1 = new LinkedList(7);
        LinkedList n1 = new LinkedList(1);
        n1.next = new LinkedList(2);
        n1.next.next = new LinkedList(3);
        n1.next.next.next = new LinkedList(4);
        n1.next.next.next.next = new LinkedList(5);
        n1.next.next.next.next.next = new LinkedList(6);
        n1.next.next.next.next.next.next = new LinkedList(7);
        // list 2
        LinkedList n2 = new LinkedList(10);
        n2.next = new LinkedList(9);
        n2.next.next = new LinkedList(8);
        n2.next.next.next = n1.next.next.next;

        boolean result = intersectingLists(n1, n2);
        System.out.println(result);

    }
    public static boolean intersectingLists(LinkedList head1, LinkedList head2) {
        HashSet<LinkedList> hashSet = new HashSet<>();
        while (head1 != null) {
            hashSet.add(head1);
            head1=head1.next;
        }
        while (head2!=null){
            if(hashSet.contains(head2)) {
                return true;
            }
            head2=head2.next;
        }
        return false;
    }


        static class LinkedList {
            int data;
            LinkedList next;

            public LinkedList(int data) {
                this.data = data;
            }
        }
}
