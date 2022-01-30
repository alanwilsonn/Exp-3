import java.util.*;
public class freqrevstring 
{
    public static void main(String args[])
    {
        freqrevstring obj=new freqrevstring();
        obj.freq();
        obj.rev();
    }
    

    void rev ()
    {
        Scanner obj1=new Scanner(System.in);
        System.out.println("Enter the string:\n");
        String str=obj1.nextLine();
        String rev="";
        int len=str.length();
        for(int i=len-1;i>=0;i--)
        {
          rev=rev+str.charAt(i);
        }
        System.out.println("Reversed string:\t"+rev);
    }
    void freq()
    {
        Scanner obj2=new Scanner(System.in);
        System.out.println("Enter the string:\n ");
        String str=obj2.nextLine();
        System.out.println("Enter the character to be checked:\n ");
        char a=obj2.next().charAt(0);
        int len=str.length();
        int frequency=0;
        for(int i=0;i<len;i++)
        {
            if(a==str.charAt(i))
            {
                System.out.println("The character is present at position "+(i+1));
                frequency++ ;   
            } 
        }
        System.out.println("\nFrequency of character is "+frequency) ;
    }
}
