package pathFromRoot;
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
class PathDemo{
    public void printpath(TreeNode root,Vector<Integer>path){
        if(root==null)
            return;
        path.add(root.val);
        if(root.left==null&&root.right==null)
            System.out.println(path);
        printpath(root.left,path);
        printpath(root.right,path);
        path.remove(path.size()-1);
    }

    public void printpathstring(TreeNode root,String path){
        if(root==null)
            return;
        path=path+root.val+" ";
        if(root.left==null&&root.right==null)
            System.out.println(path);
        printpathstring(root.left,path);
        printpathstring(root.right,path);
     //   path.remove(path.size()-1);
    }
}
public class PathRoot {
    public static void main(String args[]) {

        TreeNode root = new TreeNode(15);
        root.left = new TreeNode(10);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(11);
        root.left.left.right = new TreeNode(9);
        root.left.left.left = new TreeNode(5);
        root.left.left.left.left = new TreeNode(2);
        root.left.left.left.right = new TreeNode(6);
        root.right.left = new TreeNode(16);
        root.right.right = new TreeNode(25);
        root.right.right.left = new TreeNode(22);
        root.right.right.left.left = new TreeNode(23);
        root.right.right.right = new TreeNode(30);
        root.right.right.right.left = new TreeNode(27);
        PathDemo pd=new PathDemo();
      //  Vector<Integer>path=new Vector<>();
        String path="";
      //  pd.printpath(root,path);
        pd.printpathstring(root,path);

    }
    }
