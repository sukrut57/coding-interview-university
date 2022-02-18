import java.util.HashSet;

public class RemoveDuplicates {
    /*R�mov� Dups! Write code to remove duplicates from an unsorted linked list.
FOLLOW UP
How would you solve this problem if a temporary buffer is not allowed? */
    public static class LinkedList{
        int data;
        LinkedList next;
        public LinkedList(int data){
            this.data=data;
        }
    }
    public static void main(String[] args){
        LinkedList head=new LinkedList(5);
        head.next=new LinkedList(6);
        head.next.next=new LinkedList(6);
        head.next.next.next=new LinkedList(7);
        head.next.next.next.next=new LinkedList(8);
        removeDuplicate(head);
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }

    public static void removeDuplicate(LinkedList linkedList){
        LinkedList current=linkedList;
        LinkedList prev=null;
        HashSet<Integer> hash=new HashSet<>();
        while(current!=null){
            int currData=current.data;
            if(hash.contains(currData)){
                prev.next=current.next;
            }
            else{
                hash.add(currData);
                prev=current;
            }
            current=current.next;

        }
    }
}

