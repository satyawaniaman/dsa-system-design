package Stacks_Queues;

public class StacksUsingLinkedList {
    //implementation of stack using linked list

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    Node head;
    public void push(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public int pop(){
        if(head==null){
            System.out.println("stack is empty.");
            return Integer.MAX_VALUE;
        }
        int rv=head.data;
        head=head.next;
        return rv;
    }
    public void display(){
        if(head==null){
            System.out.println("stack is empty.");
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public boolean isEmpty(){
        return head==null;
    }
    public int peek(){
        if(head==null){
            System.out.println("stack is empty.");
            return Integer.MAX_VALUE;
        }
        return head.data;
    }
}
