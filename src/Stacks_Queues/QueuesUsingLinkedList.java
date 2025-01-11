package Stacks_Queues;

public class QueuesUsingLinkedList {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;

        }
    }
    Node head;
    Node tail;
    public void enqueue(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public int dequeue(){
        if(head==null){
            System.out.println("the queue is empty.");
            return Integer.MAX_VALUE;
        }
        int rv= head.data;
        head=head.next;
        return rv;
    }
    public void display() {
        System.out.println("-------------------");
        Node temp = this.head;

        while(temp != null) {

            System.out.print(temp.data + " " );
            temp = temp.next;
        }
        System.out.println();
        System.out.println("-------------------");
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int peek() {

        if (this.head == null) {
            System.out.println("Queue is already empty");
            return -1;
        }

        int rv = this.head.data;

        return rv;
        }
    }
