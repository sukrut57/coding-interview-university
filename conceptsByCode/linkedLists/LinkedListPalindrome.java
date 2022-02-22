public class LinkedListPalindrome {
    /*Palindrome: Implement a function to check if a linked list is a palindrome.*/
    public static void main(String[] args) {
        LinkedList head=new LinkedList(1);
        head.next=new LinkedList(2);
        head.next.next=new LinkedList(3);
        head.next.next.next=new LinkedList(2);
        head.next.next.next.next=new LinkedList(1);
        boolean result=isLinkedListPalindrome(head);
        System.out.println(result);
    }
    static class LinkedList {
        LinkedList next;
        int data;
        public LinkedList(int data) {
            this.data = data;
        }
    }

    public static boolean isLinkedListPalindrome(LinkedList head1){
        LinkedList head2=reverseLinkedList(head1);

        while(head1!=null && head2!=null){
            if(head1.data!=head2.data) {
                return false;
            }
            head1=head1.next;
            head2=head2.next;
        }
        return true;
        }

    public static LinkedList reverseLinkedList(LinkedList node){
        LinkedList head= null;
        while (node != null) {
            LinkedList n = new LinkedList(node.data); // Clone
            n.next = head;
            head=n;
            node= node.next;
            }
        return head;
    }

}
