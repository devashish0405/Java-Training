package binarytree;

import java.util.LinkedList;
import java.util.Queue;

class BinaryTreeNode{
    int val;
    BinaryTreeNode left;
    BinaryTreeNode right;
    BinaryTreeNode(int val){
        this.val=val;
    }

}

class BinaryTreeHeapEquivalent{
    private BinaryTreeNode root;

    public boolean insert(int data){
        BinaryTreeNode temp=new BinaryTreeNode(data);
        if(this.root==null){
            this.root=temp;
            return true;
        }
        Queue<BinaryTreeNode>queue=new LinkedList<>();
        queue.add(this.root);

        while (!queue.isEmpty()){
            BinaryTreeNode front=queue.remove();
            if(front.left!=null) {
                queue.add(front.left);
            }
            else{
                front.left=temp;
                return true;
            }
            if(front.right!=null) {
                queue.add(front.right);
            }
            else{
                front.right=temp;
                return true;
            }
        }
        return false;
    }
    public void levelorder(BinaryTreeNode root) {
        if (root == null)
            return;
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryTreeNode front = queue.remove();

            System.out.println(front.val);
            if (front.left != null) {
                queue.add(front.left);
            }

            if (front.right != null) {
                queue.add(front.right);
            }

        }
    }
    public BinaryTreeNode getRoot(){
            return this.root;
        }
}
public class HeapEquivalentBinaryTree {
    public static void main(String args[]){
        BinaryTreeHeapEquivalent bthe=new BinaryTreeHeapEquivalent();
        bthe.insert(10);
        bthe.insert(9);
        bthe.insert(8);
        bthe.insert(12);

        BinaryTreeNode root=bthe.getRoot();
        bthe.levelorder(root);

    }
}
