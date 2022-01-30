import java.util.*;
public class concat 
{
    public static void main(String args[])
    {
        concat obj=new concat();
        obj.con(4,5);
        obj.con("Big"+""+"ball");
    }
    void con(int a,int b)
    {
        System.out.println("Concatenated numbers:\t"+a+b);
    }
    void con(String a)
    {
        System.out.println("Concatenated string:\t"+a);
    }
    
}
