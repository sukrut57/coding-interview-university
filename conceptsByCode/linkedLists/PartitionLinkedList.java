public class PartitionLinkedList {
    /*Partition: Write code to partition a linked list around a value x, such that all nodes less than x come
before all nodes greater than or equal to x. If x is contained within the list, the values of x only need
to be after the elements less than x (see below). The partition element x can appear anywhere in the
"right partition"; it does not need to appear between the left and right partitions.
EXAMPLE
Input:
Output:
3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1 [partition= 5]
3 -> 1 -> 2 -> 10 -> 5 -> 5 -> 8
Hints: #3, #24 */

    public static void main(String[] args){
        LinkedList head1 = new LinkedList(1);
        head1.next = new LinkedList(4);
        head1.next.next = new LinkedList(3);
        head1.next.next.next = new LinkedList(2);
        head1.next.next.next.next= new LinkedList(5);
        head1.next.next.next.next.next= new LinkedList(6);

        LinkedList newNode=partitionList(head1,3);
        while (newNode!=null){
            System.out.println(newNode.data);
            newNode=newNode.next;
        }
    }

    public static LinkedList partitionList(LinkedList head,int data){
        LinkedList beforeStart = new LinkedList(0);
        LinkedList beforeEnd = beforeStart;
        LinkedList afterStart = new LinkedList(0);
        LinkedList afterEnd = afterStart;

        while(head!=null){
            if(head.data< data){
                beforeEnd.next= head;
                beforeEnd = beforeEnd.next;
            }else{
                afterEnd.next=head;
                afterEnd=afterEnd.next;
            }
            head=head.next;

            beforeEnd.next=afterStart.next;
        }

        return beforeStart.next;

    }
    static class LinkedList{
        int data;
        LinkedList next;
        public LinkedList(int data){
            this.data=data;
        }
        public LinkedList(){}
    }
}
