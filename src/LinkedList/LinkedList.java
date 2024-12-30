package LinkedList;

public class LinkedList {
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    Node head;
    public void display(){
        Node temp=this.head;
        while(temp!=null){
            System.out.print(temp.data+" => ");
            temp=temp.next;
        }
        System.out.println();
    }
    public void addFirst(int data){
        Node nn=new Node(data);
        nn.next=this.head;
        this.head=nn;
    }
    public void addLast(int data){
        if(this.head==null){
            addFirst(data);
            return;
        }
        Node nn=new Node(data);
        Node temp=this.head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=nn;
    }
    public void addAt(int data,int idx){
        if(idx<0){
            return;
        }
        if(idx==0){
            addFirst(data);
            return;
        }
        Node n=new Node(data);
        int i=0;
        Node temp=this.head;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        n.next=temp.next;
        temp.next=n;
    }
    public int removeFirst(){
        if(this.head==null){
            return -1;
        }
        int rm=this.head.data;
        this.head=this.head.next;
        return rm;

    }
    public int removeLast(){
        Node temp=this.head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        int rm=temp.next.data;
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
        Node temp=this.head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        int rm=temp.next.data;
        temp.next=temp.next.next;
        return rm;
    }


}
