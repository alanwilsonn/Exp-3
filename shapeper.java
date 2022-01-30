import java.util.*;
public class shapeper 
{
   public static void main(String args[])
   {
       shapeper obj1=new shapeper(3);
       shapeper obj2=new shapeper(4,5);
   }
    shapeper(int a)
    {
       System.out.println("Perimeter of circle:\t"+(3.14*2*a));
    }
    shapeper(int b,int c)
    {
       System.out.println("Perimeter of rectangle:\t"+(2*(b+c)));
    }
}
