package heapDemo;

import java.util.ArrayList;
import java.util.Collections;
class MinHeapImp
{
    ArrayList<Integer> al;
    MinHeapImp()
    {
        al=new ArrayList<Integer>();
    }
    public int getSize()
    {
        return al.size();
    }
    public void insert(int x)
    {
        al.add(x);
        int idx=al.size()-1;
        while(idx>=1 && al.get(idx)<al.get((idx-1)/2))
        {
            Collections.swap(al,idx,(idx-1)/2);
            idx=(idx-1)/2;
        }
    }

    public int getMin()
    {
        return al.get(0);
    }

    public void deleteMin()
    {
        Collections.swap(al,0,al.size()-1);
        al.remove(al.size()-1);
        heapify(al);

    }

    public void heapify(ArrayList<Integer> al)
    {
        for(int i=0;i<al.size();i++)
        {
            if(al.get(i)<al.get((i-1)/2))
            {
                Collections.swap(al,i,(i-1)/2);
                i=(i-1)/2;
            }
        }
        //    while(idx>=1 && al.get(idx)<al.get((idx-1)/2))
        //  {
        //    idx++;
        //  Collections.swap(al,idx,(idx-1)/2);
        //idx=(idx-1)/2;
        //}
    }
}
public class MinHeap
{
    public static void main(String[] args)
    {
        MinHeapImp mp=new MinHeapImp();
        mp.insert(5);
        mp.insert(2);
        mp.insert(6);
        mp.insert(1);
        mp.insert(10);
        mp.insert(7);
        mp.insert(4);
        System.out.println(mp.getSize());
        System.out.println(mp.al);
        System.out.println();
        System.out.println("Minimum element in heap is "+mp.getMin());
        System.out.println();
        mp.deleteMin();
        System.out.println(mp.getSize());
        System.out.println(mp.al);
        mp.deleteMin();
        System.out.println(mp.getSize());
        System.out.println(mp.al);


    }
}