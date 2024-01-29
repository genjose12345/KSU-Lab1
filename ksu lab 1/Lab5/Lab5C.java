import java.util.Scanner;
public class Lab5C
{
   public static void main(String[]args)
   {
      double y,x;
      Scanner in = new Scanner(System.in);
      System.out.println("Enter x: ");
      x = in.nextInt();
      System.out.println("Enter y: ");
      y = in.nextInt();
      
      if(x == 0 && y == 0)
      {
         System.out.println("This point is the origin.");
      }
      else if(x >= 1 && y >= 1)
      {
         System.out.println("This point is in the first quadrant.");
      }
      else if(x <= -1 && y <= -1)
      {
         System.out.println("This point is in the third quadrant.");
      }
      else if(x <= -1 && y >= 1)
      {
        System.out.println("This point is in the second quadrant.");  
      }
      else if(x >= 1 && y <= -1)
      {
         System.out.println("This point is in the fourth quadrant.");
      }
      else if(y == 0)
      {
         System.out.println("This point is on the x axis. ");
      }
      else if(x == 0)
      {
         System.out.println("This point is on the y axis. ");
      }
      
   }
      
}