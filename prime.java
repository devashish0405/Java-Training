import java.util.Scanner;

public class prime {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a  number");
        int n=sc.nextInt();
        int flag=1;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                flag=0;
                break;
            }
        }
        if(flag==0)
            System.out.println(n+" is not a prime no");
        else {
            System.out.println(n + " is a prime");
        }
    }
}
