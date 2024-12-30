package LinkedList;

public class DoublyLinkedListClient {
    public static void main(String[] args) {
        DoublyLinkedList ll=new DoublyLinkedList();
        ll.insertFirst(1);
        ll.insertEnd(3);
        ll.printLL();
        ll.insertAt(2,2);
        ll.printLL();
        ll.insertAt(5,1);
        ll.printLL();
    }

}
