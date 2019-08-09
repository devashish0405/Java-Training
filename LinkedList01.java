//class Node {
//    int val;
//    Node next;
//    Node(int data) {
//        this.val = data;
//        this.next = null;
//    }
//}
//
//
//class LinkedListImp {
//    public Node insertAtHead(Node head, int data) {
//        Node temp = new Node(data);
//        if (head == null) {
//            head = temp;
//            temp = null;
//        } else {
//            temp.next = head;
//            head = temp;
//            temp = null;
//        }
//        return head;
//    }
//    public Node insertAtTail(Node head,int data)
//    {
//      Node th=head;
//        Node temp = new Node(data);
//        if (head == null) {
//            head = temp;
//            temp = null;
//          return head;
//        } else
//            {
//            while (head.next != null) {
//                head = head.next;
//            }
//                head.next=temp;
//                temp.next = null;
//
//        }
//
//        return th;
//    }
//
//    public Node insertAtPosition(Node head,int data,int pos)
//    {
//        Node th=head;
//        Node temp = new Node(data);
//        if (head == null) {
//            head = temp;
//            temp = null;
//            return head;
//        } else
//        {
//            int i=1;
//            while (i<pos-1) {
//                head = head.next;
//                i++;
//            }
//           Node store=head.next;
//            head.next=temp;
//            temp.next=store;
//
//        }
//
//        return th;
//    }
//
//    public Node deleteAtHead(Node head)
//    {
//        head=head.next;
//        return head;
//    }
//
//    public Node deleteAtTail(Node head)
//    {
//        Node th=head;
//        while(head.next.next!=null)
//        {
//            head = head.next;
//        }
//        head.next=null;
//        return th;
//    }
//
//    public Node deleteAtPosition(Node head,int pos)
//    {
//        Node th=head;
//        int i=1;
//        while(i<pos-1)
//        {
//            head = head.next;
//            i++;
//        }
//        head.next=head.next.next;
//        return th;
//    }
//
//
//    public void printList(Node head)
//    {
//        System.out.print("HEAD");
//        while (head != null) {
//            System.out.print("-->");
//            System.out.print(head.val);
//            head = head.next;
//        }
//        System.out.print("-->NULL");
//    }
//
//}
//
// class LinkedList01
// {
//     public static void main(String args[]) {
//         Node head = null;
//         LinkedListImp ll = new LinkedListImp();
//         for (int i = 1; i < 20; i++) {
//           //  head = ll.insertAtHead(head, i);
//             head = ll.insertAtTail(head, i);
//         }
//         ll.printList(head);
//       //  head=ll.deleteAtHead(head);
//       // head=ll.deleteAtHead(head);
//       //  System.out.println("\n");
//         // head=ll.insertAtHead(head,20);
//         // while(head!=null)
//         // System.out.println(head.val);
//         // System.out.println(head.next.val);
//        // ll.printList(head);
//       //  head=ll.deleteAtTail(head);
//       //  System.out.println("\n");
//       //  ll.printList(head);
//        // head=ll.insertAtPosition(head,25,3);
//        // System.out.println("\n");
//        // ll.printList(head);
//         System.out.println("\n");
//         head=ll.deleteAtPosition(head,3);
//         ll.printList(head);
//
//     }
// }
//
