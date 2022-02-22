public class SumLists {
    /*Sum Lists: You have two numbers represented by a linked list, where each node contains a single
digit. The digits are stored in reverse order, such that the 1 's digit is at the head of the list. Write a
function that adds the two numbers and returns the sum as a linked list.
EXAMPLE
Input: (7-> 1 -> 6) + (5 -> 9 -> 2).That is,617 + 295.
Output: 2 -> 1 -> 9. That is, 912.
    * */
    public static void main(String[] args){
        LinkedList head1=new LinkedList(7);
        head1.next=new LinkedList(1);
        head1.next.next=new LinkedList(6);

        LinkedList head2=new LinkedList(5);
        head2.next=new LinkedList(9);
        head2.next.next=new LinkedList(2);

        LinkedList list1=reverseLinkedList(head1);
        LinkedList list2=reverseLinkedList(head2);

        int sumOfLists=sumOfLinkedLists(list1,list2);
        LinkedList sumAsLinkedList = returnSumAsLinkedList(sumOfLists);
        LinkedList reverseSum=reverseLinkedList(sumAsLinkedList);
        while (reverseSum!=null){
            System.out.println(reverseSum.data);
            reverseSum=reverseSum.next;
        }
    }

    public static LinkedList returnSumAsLinkedList(int sum){
        LinkedList head;
        String sumAsString=String.valueOf(sum);
        head=new LinkedList(Character.getNumericValue(sumAsString.charAt(0)));
        LinkedList current=head;
        for(int i=1;i<sumAsString.length();i++){
            current.next=new LinkedList(Character.getNumericValue(sumAsString.charAt(i)));
            current=current.next;
        }
        return head;
    }

    public static int sumOfLinkedLists(LinkedList head1,LinkedList head2){
        if(head1 ==null& head2 ==null) return 0;
        StringBuilder stringBuilder1=new StringBuilder();
        StringBuilder stringBuilder2=new StringBuilder();
        while(head1!=null && head2!=null){
            stringBuilder1.append(head1.data);
            stringBuilder2.append(head2.data);
            head1=head1.next;
            head2=head2.next;
        }
        return Integer.parseInt(stringBuilder1.toString())+Integer.parseInt(stringBuilder2.toString());
    }

    public static LinkedList reverseLinkedList(LinkedList head){
        LinkedList current=head;
        LinkedList nextPtr=head;
        LinkedList prev=null;
        LinkedList newList;

        while(current!=null){
            nextPtr=nextPtr.next;
            current.next=prev;
            prev=current;
            current=nextPtr;
        }
        newList=prev;
        return newList;
    }

    static class LinkedList {
        LinkedList next = null;
        int data;

        public LinkedList(int data) {
            this.data = data;
        }
    }
}
