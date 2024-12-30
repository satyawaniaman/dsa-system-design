package LinkedList;

public class RemoveDuplicateFromSortedDoublyList {
    class Node
    {
        int data;
        Node next;
        Node prev;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    };
    public static Node uniqueSortedList(Node head) {
        // Write your code here.
        if(head==null || head.next==null){
            return head;
        }
        Node curr=head;
        while(curr.next!=null){
            if(curr.data==curr.next.data){
                deleteNode(curr.next);
            }
            else{
                curr=curr.next;
            }
        }
        return head;
    }
    public static void deleteNode(Node del){
        if(del==null){
            return ;
        }
        if(del.prev==null){
            del.next.prev=null;
            del=del.next;
        }
        else{
            if(del.next!=null){
                del.next.prev=del.prev;
            }
            del.prev.next=del.next;
        }
    }
}
