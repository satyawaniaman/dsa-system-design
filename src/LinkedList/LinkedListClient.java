package LinkedList;

public class LinkedListClient {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addFirst(20);
        ll.addFirst(10);
        ll.display();
        ll.addLast(30);
        ll.display();
        ll.addAt(15,1);
        ll.display();
        ll.removeAt(2);
        ll.display();

    }
}
