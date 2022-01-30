import java.util.*; 
class employee
 { 
  public static void main(String args[])
   {
    Scanner obj=new Scanner(System.in);
    for(int i=1;i<=5;i++)
    { 
      System.out.println("Details of employee "+i);
      System.out.println("Enter the employee number:");
      int n=obj.nextInt();
      System.out.println("Enter the employee Name:");
      String name=obj.next();
      System.out.println("Enter the employee's phone number:");
      String phone=obj.next();
    }
   }
}