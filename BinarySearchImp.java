package BinarySearchImpl;

import java.util.Vector;

class BinarySearch{
    public int binarySearch(Vector<Integer>A,int target,int start,int end) {
        if (start <= end) {
            int mid = start + (end - start) / 2;
            if (A.get(mid) == target) {
                return mid;
            } else if (A.get(mid) > target) {

                return this.binarySearch(A, target, start, mid - 1);
            } else  {

                return this.binarySearch(A, target, mid + 1, end);
            }

        }

            return -1;
    }
}
public class BinarySearchImp {
    public static void main(String args[])
    {
        BinarySearch bs=new BinarySearch();
        Vector<Integer>A=new Vector<>();
        A.add(1);
        A.add(3);
        A.add(5);
        A.add(7);
        A.add(10);
        A.add(11);
        A.add(12);
        A.add(14);
        A.add(15);
        A.add(16);
        A.add(17);
        int r=bs.binarySearch(A,12,0,A.size()-1);
        System.out.println(A);
        System.out.println(r);

    }
}




