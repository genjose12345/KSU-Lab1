import java.util.Scanner;
public class Lab3B
{
   public static void main(String args[])
   {
      float course1,course2,course3,course4,grade1,grade2,grade3,grade4,gpa;
      float total = 0;
      float totalhour = 0;
      Scanner in = new Scanner(System.in);
      System.out.print("course 1 hours:");
      course1 = in.nextFloat();
      System.out.print(" Grade for course 1:");
      grade1 = in.nextFloat();
      System.out.print(" course 2 hours:");
      course2 = in.nextFloat();
      System.out.print(" Grade for course 2:");
      grade2 = in.nextFloat();
      System.out.print(" course 3 hours:");
      course3 = in.nextFloat();
      System.out.print(" Grade for course 3:");
      grade3 = in.nextFloat();
      System.out.print(" course 4 hours:");
      course4 = in.nextFloat();
      System.out.print(" Grade for course 4:");
      grade4 = in.nextFloat();
      totalhour = course1+course2+course3+course4;
      total = (course1*grade1) + (course2*grade2) + (course3*grade3) + (course4*grade4);
      gpa = total / totalhour;
      System.out.print("Total Hours is: "+ totalhour);
      System.out.println("Total quality points is: "+total);
      System.out.println("Your GPA for this semester is "+ gpa);
   }
}