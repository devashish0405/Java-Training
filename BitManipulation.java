public class BitManipulation {
    public static void main(String[] args) {
        int[] A=new int[]{1,1,2,2,3,3,4,4,5,5,6,7,7,8,8,9,9};
        int a=A[0];
        for(int i=1;i<A.length;i++){
            a=a^A[i];
        }
     /*   for(int i=0;i<A.length;i++)
            a=a-A[i];
        System.out.println(a);   */
        System.out.println(a);
    }
}
