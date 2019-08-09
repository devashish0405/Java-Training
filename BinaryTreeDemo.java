package binarytree;

import java.util.*;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
        this.left=null;
        this.right=null;

    }
}

 class BinaryTree {
     static TreeNode root = null;

     public static void levelorder(TreeNode root) {
         Queue<TreeNode> que = new LinkedList<TreeNode>();
         List<Integer> al = new ArrayList<Integer>();
         List<List<Integer>> list = new ArrayList<List<Integer>>();
         que.add(root);
         que.add(null);
         while (!que.isEmpty()) {
             TreeNode t = que.poll();
             if (t == null) {

                 if (!que.isEmpty()) {
                     que.add(null);
                     list.add((al));

                     al = new ArrayList<Integer>();

                 }
             } else {
                 if (t.left != null)
                     que.add(t.left);
                 if (t.right != null)
                     que.add(t.right);
                 al.add(t.val);
             }
         }
         list.add(al);
         System.out.println(list);
         //  System.out.println(al);



         }



     public static void levelorderLeftView(TreeNode root) {
         Queue<TreeNode> que = new LinkedList<TreeNode>();
         List<Integer> al = new ArrayList<Integer>();
         List<List<Integer>> list = new ArrayList<List<Integer>>();
         que.add(root);
         que.add(null);
         while (!que.isEmpty()) {
             TreeNode t = que.poll();
             if (t == null) {

                 if (!que.isEmpty()) {
                     que.add(null);
                     list.add((al));

                     al = new ArrayList<Integer>();

                 }
             } else {
                 if (t.left != null)
                     que.add(t.left);
                 if (t.right != null)
                     que.add(t.right);
                 al.add(t.val);
             }
         }
         list.add(al);
         System.out.println(list);
         List<Integer> res = new ArrayList<Integer>();
         for (int i = 0; i < list.size(); i++) {
             List<Integer> temp = list.get(i);
             System.out.print(temp.get(0));

         }
     }


     public static void levelorderRightView(TreeNode root) {
         Queue<TreeNode> que = new LinkedList<TreeNode>();
         List<Integer> al = new ArrayList<Integer>();
         List<List<Integer>> list = new ArrayList<List<Integer>>();
         que.add(root);
         que.add(null);
         while (!que.isEmpty()) {
             TreeNode t = que.poll();
             if (t == null) {

                 if (!que.isEmpty()) {
                     que.add(null);
                    // Different logic for left view//int data=al.get(0);
                     //System.out.println(data);
                     list.add((al));

                     al = new ArrayList<Integer>();

                 }
             } else {
                 if (t.left != null)
                     que.add(t.left);
                 if (t.right != null)
                     que.add(t.right);
                 al.add(t.val);
             }
         }
         list.add(al);
         System.out.println(list);
         List<Integer> res = new ArrayList<Integer>();
         for (int i = 0; i < list.size(); i++) {
             List<Integer> temp = list.get(i);
             System.out.print(temp.get(temp.size() - 1));


         }
     }
 }
public class BinaryTreeDemo{
    public static  void main(String args[]){
        TreeNode root=new TreeNode(1);
        BinaryTree bt=new BinaryTree();
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);
        root.left.left.right=new TreeNode(8);
        bt.levelorder(root);
        bt.levelorderLeftView(root);
        System.out.println();
        bt.levelorderRightView(root);

    }
}
