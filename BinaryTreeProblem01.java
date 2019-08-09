package binarytreeproblem;

import java.util.HashMap;
import java.util.Vector;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int data){
        this.val=data;
        this.left=null;
        this.right=null;
    }
}

class BinaryTreeProblem{
    HashMap<Integer,Vector<Integer>>hm=new HashMap<>();
    public void getVerticalOrder(TreeNode root,int index){
        Vector<Integer>v=new Vector<>();
       if(root==null)
           return;
  if(hm.get(index)==null){
      v.add(root.val);
      hm.put(index,v);
  }
else{
v=hm.get(index);
v.add(root.val);
hm.put(index,v);
       }
        getVerticalOrder(root.left,index-1);
        System.out.print(root.val+" ");
        getVerticalOrder(root.right,index+1);
    }



}

public class BinaryTreeProblem01 {
    public static void main(String args[]){

        TreeNode root = new TreeNode(15);
        root.left = new TreeNode(10);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(11);
        root.left.left.right = new TreeNode(9);
        root.left.left.left = new TreeNode(5);
        root.left.left.left.left= new TreeNode(2);
        root.left.left.left.right = new TreeNode(6);
        root.right.left = new TreeNode(16);
        root.right.right = new TreeNode(25);
        root.right.right.left = new TreeNode(22);
        root.right.right.left.left = new TreeNode(23);
        root.right.right.right = new TreeNode(30);
        root.right.right.right.left = new TreeNode(27);
        BinaryTreeProblem btp=new BinaryTreeProblem();
        //HashMap<Integer,Vector<Integer>>verticalOrder=new HashMap<>();
        btp.getVerticalOrder(root,0);
        System.out.println();
        System.out.println(btp.hm);


    }
}

