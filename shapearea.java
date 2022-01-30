import java.util.*;
public class shapearea 
{
    public static void main(String args[])
    {
        shapearea obj=new shapearea();
        obj.area(1);
        obj.area(2,3);
        obj.area(4.5,5.5);
    }
    void area(int a)
    {
        System.out.println("Area of circle:\t"+(3.14*a*a));
    }
    void area(int b,int c)
    {
        System.out.println("Area of rectangle:\t"+(b*c));
    }
    void area(double d,double e)
    {
        System.out.println("Area of triangle:\t"+(0.5*d*e));
    }

    
}
