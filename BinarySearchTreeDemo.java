package binarysearchtree;

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

class BinarySearchTree{
    public TreeNode getMax(TreeNode root){
        while(root.right!=null){
            root=root.right;
        }
        return root;
    }

    public TreeNode getMin(TreeNode root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }

    public TreeNode getMaxRecursive(TreeNode root){
        if(root.right==null){
           return root;
        }
        return getMaxRecursive(root.right);

    }

    public TreeNode getMinRecursive(TreeNode root){
        if(root.left==null){
            return root;
        }
       return getMinRecursive(root.left);

    }
    public boolean searchElement(TreeNode root,int data){
       while(root!=null) {
           if (root.val == data)
               return true;
           else if (root.val < data)
               root = root.right;
           else
               root = root.left;
       }
        return false;
    }

    public boolean searchElementRecursive(TreeNode root,int data){

            if (root.val == data)
                return true;
            if (root.val < data && root.right!=null)
               return searchElementRecursive(root.right,data);
        if (root.val > data && root.left!=null)
            return searchElementRecursive(root.left,data);

        return false;
    }

    public int getHeight(TreeNode root){
        //TreeNode temp=root;
        if(root==null)
            return 0;
        int l=getHeight(root.left);
        int r=getHeight(root.right);
        return 1+Math.max(l,r);
    }
    public void getInorder(TreeNode root){
        if(root==null)
            return;
            getInorder(root.left);
        System.out.print(root.val+" ");
        getInorder(root.right);
    }
    public TreeNode insert(TreeNode root,int data){
        TreeNode temp=new TreeNode(data);
        if(root==null) {
            root = temp;
            return root;
        }
        else if(root.val<data) {
            insert(root.right, data);
            return root;
        }
        else {
            insert(root.left, data);
            return root;
        }

    }

    public void getpreorder(TreeNode root){
        if(root==null)
            return;
        System.out.print(root.val+" ");
        getInorder(root.left);
        getInorder(root.right);
    }

    public void getpostorder(TreeNode root){
        if(root==null)
            return;
        getInorder(root.left);
        getInorder(root.right);
        System.out.print(root.val+" ");
    }

}

public class BinarySearchTreeDemo {
    public static void main(String args[]){

        TreeNode root = new TreeNode(15);
        root.left = new TreeNode(10);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(11);
        root.left.left.right = new TreeNode(9);
        root.left.left.left = new TreeNode(5);
        root.left.left.left .left= new TreeNode(2);
        root.left.left.left.right = new TreeNode(6);
        root.right.left = new TreeNode(16);
        root.right.right = new TreeNode(25);
        root.right.right.left = new TreeNode(22);
        root.right.right.left.left = new TreeNode(23);
        root.right.right.right = new TreeNode(30);
        root.right.right.right.left = new TreeNode(27);


        BinarySearchTree bst=new BinarySearchTree();
        TreeNode node=bst.getMax(root);
        TreeNode node1=bst.getMin(root);
        System.out.println(node.val);
        System.out.println(node1.val);
        TreeNode node2=bst.getMaxRecursive(root);
        System.out.println(node2.val);
        TreeNode node3=bst.getMinRecursive(root);
        System.out.println(node3.val);
        boolean ele=bst.searchElement(root,7);
        System.out.println("Element Search:"+ele);
        boolean eleRecursive=bst.searchElement(root,27);
        System.out.println("Recursive element search:"+eleRecursive);
        int h=bst.getHeight(root);
        System.out.println(h);
        bst.getInorder(root);
        System.out.println();
        bst.getpreorder(root);
        System.out.println();
        bst.getpostorder(root);

    }
}
