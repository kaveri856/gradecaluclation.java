package grades;
import java.util.Scanner;

public class GradeCaluclation
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int n;
        n=scanner.nextInt();
        int marks[] = new int[n];
        int i;
        float total=0, avg;
        for(i=0; i<6; i++) { 
           System.out.print("Enter Marks of Subject"+(i+1)+":");
           marks[i] = scanner.nextInt();
           total = total + marks[i];
        }
        scanner.close();
        avg = total/6;
        System.out.print("The student Grade is: ");
        if(avg>=80)
        {
            System.out.print("A");
        }
        else if(avg>=60 && avg<80)
        {
           System.out.print("B");
        } 
        else if(avg>=40 && avg<60)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("D");
        }
    }
}
