import java.util.Scanner;
public class Lab4A
{
   public static void main(String[] args)
   {
      double grade;
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the score of your Exam:");
      grade = in.nextDouble();
      
      if (grade>=0 && grade<=64) 
      {
         System.out.println("Letter grade is: F");
      }
      else if (grade>=65 && grade<=67) 
      {
         System.out.println("Letter grade is: D-");
      }
      else if (grade>=68 && grade<=70) 
      {
         System.out.println("Letter grade is: D");
      }
      else if(grade>=71 && grade<=73) 
      {
         System.out.println("Letter grade is: D+");
      }
      else if (grade>=74 && grade<=76) 
      {
         System.out.println("Letter grade is: C-");
      }
      else if (grade>=77 && grade<=79) 
      {
         System.out.println("Letter grade is: C");
      }
      else if (grade>=80 && grade<=82) 
      {
         System.out.println("Letter grade is: C+");
      }
      else if (grade>=83 && grade<=85) 
      {
         System.out.println("Letter grade is: B-");
      }
      else if (grade>=86 && grade<=88) 
      {
         System.out.println("Letter grade is: B");
      }
      else if (grade>=89 && grade<=91) 
      {
         System.out.println("Letter grade is: B+");
      }
      else if (grade>=92 && grade<=94) 
      {
         System.out.println("Letter grade is: A-");
      }
      else if (grade>=95 && grade<=97) 
      {
         System.out.println("Letter grade is: A");
      }
      else if (grade>=98 && grade<=100) 
      {
         System.out.println("Letter grade is: A+");
      }
      

   }
}