package vectorimp;

import java.util.Vector;

public class VectorImp {
    public static void main(String[] args) {
        Vector<Object> v = new Vector<>();
        v.add(1);
        v.add(0,8);
        v.add("dev");
        System.out.println(v);
    }
}
