import java.util.Scanner;
public class Lab10A
{
   public static void main(String []args)
   {  
      int x,y;   
      Scanner in = new Scanner(System.in);
      System.out.println("Enter number 1:");
      x= in.nextInt();
      System.out.println("Enter number 2:");
      y=in.nextInt();
      max(x,y);
      min(x,y);
      average(x,y);
      System.out.println("Min is "+ min(x,y));
      System.out.println("Max is "+ max(x,y));
      System.out.println("Average is "+ average(x,y));
   }
   public static double max(int x, int y)
   {
      if(x>y)
      {
         return x;
      }
      else
      {
         return y;
      }
   }
   public static double min(int x, int y)
   {
      if(x<y)
      {
         return x;
      }
      else
      {
         return y;
      }
   }
   public static double average(int x, int y)
   {
      return (x+y)/2;
   }
}