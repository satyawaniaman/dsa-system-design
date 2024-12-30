package LinkedList;

public class DoublyLinkedList {
    Node head;
    class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public void insertFirst(int data){
        Node newNode = new Node(data);
        newNode.next=head;
        while(head!=null){
            head.prev=newNode;
        }
        head=newNode;
    }
    public void insertEnd(int data){
        Node newNode=new Node(data);
        if(head==null){
            insertFirst(data);
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
    }
    public void insertAt(int data,int idx){
        if(idx<0){
            throw new IllegalArgumentException("Index cannot be negative");
        }
        if(idx==0){
            insertFirst(data);
            return;
        }
        if(head==null){
            throw new IndexOutOfBoundsException("Index exceeds list size");
        }
        Node newNode=new Node(data);
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public int removeFirst(){
        if(head==null){
            return -1;
        }
        int rm=head.data;
        head=head.next;
        head.prev=null;
        return rm;
    }
    public int removeLast(){
        if(head==null){
            return -1;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        int rm=temp.data;
        temp.next=null;
        return rm;
    }
    public int removeAt(int idx){
        if(idx<0){
            return -1;
        }
        if(idx==0){
            removeFirst();
        }
        int i=0;
        Node temp=head;
        while(i<idx){
            i++;
            temp=temp.next;
        }
        int rm=temp.next.data;
        temp.next=temp.next.next;
        return rm;
    }
    public void printLL(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
