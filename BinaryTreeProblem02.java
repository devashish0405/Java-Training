package binarytreeproblem2;
import java.util.ArrayList;
import java.util.HashSet;

class Node{
    int val;
     Node left;
     Node right;

    Node(int data){
        this.val=data;
        this.left=null;
        this.right=null;
    }
}
class BinaryTreesum {
    HashSet<Integer>h=new HashSet<Integer>();
    int flag=0;

    public void search(Node root, int key) {
        if(root==null)
            return;
        int one=root.val;
        int res=key-one;

            if(h.contains(res))
            {
                ArrayList<Integer>l=new ArrayList<>();
               // flag=1;
                l.add(root.val);
                l.add(res);
                System.out.println(l);
            }
            h.add(root.val);
                search(root.left,key);
                search(root.right,key);
               // if(flag==0)
                //{
                  //  System.out.println("False");
                //}

    }
    public void getInorder(Node root){
        if(root==null)
            return;
        getInorder(root.left);
        h.add(root.val);
        getInorder(root.right);
    }
}
public class BinaryTreeProblem02 {
    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(10);
        root.right = new Node(20);
        root.left.left = new Node(5);
        root.left.right = new Node(11);
        root.left.right.right = new Node(12);
        root.left.left.right = new Node(6);
        root.left.left.right.right = new Node(7);
        root.left.left.left = new Node(1);
        root.left.left.left.left = new Node(0);
        root.left.left.left.right = new Node(2);
        root.right.left = new Node(19);
        root.right.left.left = new Node(16);
        root.right.left.left.right = new Node(17);
        root.right.right = new Node(25);
        root.right.right.left = new Node(23);
        root.right.right.left.left = new Node(22);
        root.right.right.left.right = new Node(24);
        root.right.right.right = new Node(30);
        root.right.right.right.left = new Node(27);
        root.right.right.right.left.left = new Node(26);
        root.right.right.right.left.right = new Node(29);
        root.right.right.right.right = new Node(35);
        BinaryTreesum bts=new BinaryTreesum();
       // bts.search(root,9);
      //  bts.getInorder(root);
        bts.search(root,18);

    }
}
