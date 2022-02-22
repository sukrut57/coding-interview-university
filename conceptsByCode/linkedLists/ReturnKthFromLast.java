public class ReturnKthFromLast {
    /*Return Kth to Last: Implement an algorithm to find the kth to last element of a singly linked list.*/
    public static void main(String[] args){
        LinkedList head=new LinkedList(1);
        head.next=new LinkedList(2);
        head.next.next=new LinkedList(3);
        head.next.next.next=new LinkedList(4);
        head.next.next.next.next=new LinkedList(5);
        int result=returnKFromLast(head,1);
        System.out.println(result);
    }

    public static int  returnKFromLast(LinkedList head,int k){
        //1->2->3->4->5 , k=1
        LinkedList current=head;
        LinkedList prev=null;
        for(int i=0;i<=k;i++){
            current=current.next;
        }
        while(current.next!=null){
            prev=current;
            current=current.next;
        }
        return prev.value;
    }
    static class LinkedList{
        int value;
        LinkedList next;
        public LinkedList(int value){
            this.value=value;
        }
    }
}
