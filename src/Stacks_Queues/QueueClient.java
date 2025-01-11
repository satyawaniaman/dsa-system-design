package Stacks_Queues;

public class QueueClient {
    public static void main(String[] args) {
        QueuesUsingLinkedList q=new QueuesUsingLinkedList();
        q.enqueue(3);
        q.enqueue(5);
        q.enqueue(6);
        q.dequeue();
        q.display();
    }

}
