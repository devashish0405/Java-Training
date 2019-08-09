package DynamicprogrammingDemo;

class LCS{
    public int lcs(String A,String B,int i,int j){
        if(i==A.length()||j==B.length()){
            return 0;
        }
        else if(A.charAt(i)==B.charAt(j)){
            System.out.println(A.substring(i)+" "+B.substring(j));
            return 1+lcs(A,B,i+1,j+1);
        }
        else{
            return Math.max(lcs(A,B,i+1,j),lcs(A,B,i,j+1));
        }
    }
}
public class LongestCommonSubsequence {
    public static void main(String[] args) {
        LCS l=new LCS();
        int m=l.lcs("ABC","ABD",0,0);
        System.out.println(m);
    }
}
