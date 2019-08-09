package queue_01;
class Node
{
    int val;
    Node next;
    Node(int data){
        this.val=data;
        this.next=null;
    }
}

class Queue{
    static Node front=null;
    static Node rear=null;
    public static void enqueue(int data){
        Node temp=new Node(data);
        if(front == null && rear == null) {
            front = temp;
            rear = temp;
            temp=null;
        }
        else{
            rear.next=temp;
            rear=rear.next;
            temp=null;
        }
    }
    public static Node dequeue(){
        if(front == null){
            return null;
        }

            Node temp=front;
            front=front.next;
            temp.next=null;
        return temp;
    }

    public static Node getFront(){
        return Queue.front;

    }
    public static Node getRear(){
        return Queue.rear;

    }

}

public class QueueDemo {
    public static void main(String args[]){
        Queue.enqueue(1);
        Queue.enqueue(2);
        Queue.enqueue(3);
        Queue.enqueue(4);
        Queue.enqueue(5);
        Queue.enqueue(6);

        Node f=Queue.getFront();
        System.out.println(f.val);

        Node r=Queue.getRear();
        System.out.println(r.val);

        Node d=Queue.dequeue();
        System.out.println(d.val);

        Node f1=Queue.getFront();
        System.out.println(f1.val);

        Node r1=Queue.getRear();
        System.out.println(r1.val);
    }
}
