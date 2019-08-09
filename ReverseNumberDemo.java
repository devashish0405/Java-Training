public class ReverseNumberDemo {
    public static void main(String args[]){
        int i=20;
        ReverseNumberDemo r=new ReverseNumberDemo();
       // r.recursive(20);
        r.recursive(20);
    }
    public void recursive(int i){
        if(i>0) {
            recursive(i-1);
            System.out.println(i+" ");
            //recursive(i-1);
        }
            if(i==0)
                System.out.println(i+" ");
    }

}
