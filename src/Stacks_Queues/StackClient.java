package Stacks_Queues;

public class StackClient {
    public static void main(String[] args) {
        StacksUsingLinkedList ss=new StacksUsingLinkedList();
        ss.push(1);
        ss.push(3);
        System.out.print(ss.peek());
    }
}
