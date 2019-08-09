package DynamicprogrammingDemo;

class FibnacciSeriesDynamic{
    public long fibonacci(int n)
    {
        long memo[]=new long[n+1];
        memo[0]=1;
        memo[1]=1;
        for(int i=2;i<=n;i++){
          memo[i]=memo[i-1]+memo[i-2];
        }

        return memo[n];
    }
}
public class FibanocciSeriesDemo {
    public static void main(String[] args) {
        long srtTime=System.nanoTime();
        FibnacciSeriesDynamic fib=new FibnacciSeriesDynamic();
        long num=fib.fibonacci(45);
        System.out.println(num);
        long endTime=System.nanoTime();
        long totalTime=endTime-srtTime;
        System.out.println(totalTime/1e6);
    }
}
