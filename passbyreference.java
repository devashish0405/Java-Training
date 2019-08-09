package Java01;

import java.util.Vector;

class PassbyReference {

    public void  theFunction(Vector<Integer>v){

       v.add(2);
       v.add(3);
       Vector<Integer>vector=new Vector<>();
       vector.add(10);
       vector.add(11);
       vector.add(12);
       vector.add(13);

       v=vector;

        System.out.println(v);
    }
}

public class passbyreference{
    public static void main(String args[]) {
        PassbyReference pr=new PassbyReference();
        Vector<Integer>vec=new Vector<>();
        vec.add(1);
        pr.theFunction(vec);
        System.out.println(vec);
    }
}