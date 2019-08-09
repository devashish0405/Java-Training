package heappkg;

import java.util.Collections;
import java.util.Vector;

class MaxHeap{
   // private int heapSize;
    private Vector<Integer>maxheap=new Vector<Integer>();
  //  MaxHeap(int heapSize){
   //     this.heapSize=heapSize;
 //   }

    private void heapify(int lastindex) {

        if (lastindex > 0) {

            int parentIndex = -1;
            if (lastindex % 2 == 0) {
                parentIndex = (lastindex - 2) / 2;
            }
            if (lastindex % 2 == 1) {
                parentIndex = (lastindex - 1) / 2;
            }
            if (maxheap.get(parentIndex) < maxheap.get(lastindex)) {
                Collections.swap(maxheap, parentIndex, lastindex);
            }
            this.heapify(parentIndex);
        }
    }

    public void addElement(int element){
        if(maxheap.size()==0){
            this.maxheap.add(element);
            return;
        }
            this.maxheap.add(element);
        int lastindex=maxheap.size()-1;
            this.heapify(lastindex);
    }

    public int getMax(){
       return this.maxheap.get(0);
    }

    public void printHeap(){
        for(int i=0;i<this.maxheap.size();i++){
            System.out.println(maxheap.get(i)+" ");
        }
    }
}

public class HeapDemo {
    public static void main(String args[]){
        MaxHeap maxheapobj=new MaxHeap();
        maxheapobj.addElement(1);
        maxheapobj.addElement(2);
        maxheapobj.addElement(5);
        maxheapobj.addElement(3);
        maxheapobj.addElement(7);
        maxheapobj.addElement(10);


        maxheapobj.printHeap();
        System.out.println();
        int e=maxheapobj.getMax();
        System.out.println(e);
    }
}
