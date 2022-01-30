import java.util.*;
class student 
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter name of student:\n");;
        String name=obj.nextLine();
        System.out.println("Enter the rollno:\n");
        int roll=obj.nextInt();
        System.out.print("Enter marks in 1st subject: ");
        int m1 = obj.nextInt();
        System.out.print("Enter marks in 2nd subject: ");
        int m2 = obj.nextInt();
        System.out.print("Enter marks in 3rd subject: ");
        int m3 = obj.nextInt();
        System.out.print("Enter marks in 4th subject: ");
        int m4 = obj.nextInt();
        System.out.print("Enter marks in 5th subject: ");
        int m5 = obj.nextInt();
        int total = m1 + m2 + m3 + m4 + m5;
        double avg = total / 500.0 * 100.0;
        String grade;
        if(avg>=90)
        grade="A+";
        if(avg>=80)
        grade="A";
        if(avg>=70)
        grade="B+";
        if(avg>=60)
        grade="B";
        if(avg>=50)
        grade="C";
        if(avg>=40)
        grade="D";
        else
        grade="E";
        System.out.println("Name:\t"+name);
        System.out.println("Roll not"+roll);
        System.out.println("Total mark:\t"+total);
        System.out.println("Percentage:\t"+avg);
        System.out.println("Grade:\t"+grade);


    }
}