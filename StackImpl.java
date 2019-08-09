package stack_02;

class Node1{
    int val;
    Node1 next;

    Node1(int data)
    {
        this.val=data;
        this.next=null;
    }
}
class Stack {
    static Node1 top=null;
    public static void push(int data){
        Node1 temp=new Node1(data);
        temp.next=top;
        top=temp;
    }

    public static Node1 pop(){
        if(top==null) {
            return null;
        }
        Node1 temp=top;
        top=top.next;
        temp.next=null;
        return temp;
    }

    public static  Node1 getTop(){
        return top;
    }
}

public class StackImpl{
    public static void main(String args[]){
        Stack.push(10);
        Stack.push(11);
        Stack.push(12);
        Stack.push(13);
        Stack.push(14);
        Stack.push(15);

        Node1 t1=Stack.getTop();
        System.out.println(t1.val);

        Node1 t=Stack.pop();
        System.out.println(t.val);

        Node1 t2=Stack.getTop();
        System.out.println(t2.val);
    }

}
