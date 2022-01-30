import java.util.*;
public class factorialsum 
{
    public static void main(String args[])
    {
        factorialsum obj1=new factorialsum();
        obj1.fact();
        obj1.sum();

    }
    void sum()
    {
        int sum=0,x;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number for finding sum:\n");
        int a=obj.nextInt();
        while(a>0)
        {
            x=a%10;
            sum+=x;
            a=a/10;
        }
        System.out.println("Sum is:\t"+sum);
    }
    void fact()
    {
        Scanner obj2=new Scanner(System.in);
        int f=1,i;
        System.out.println("Enter the number for finding factorial:\n");
        int n=obj2.nextInt();
        for(i=1;i<=n;i++)
        {
            f=f*i;
        }
        System.out.println("Factorial:\t"+f);
    }
    
}
