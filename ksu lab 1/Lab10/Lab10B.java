import java.util.Scanner;
public class Lab10B
{
   public static void main(String[]args)
   {
      String answer="";
      do 
     {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter width:");
      double   width = in.nextInt();
      System.out.println("Enter height:");
      double height = in.nextInt();
      isValid(width,height);
      area(width,height);
      perimeter(width,height);
      if(isValid(width,height) == true)
      {
         System.out.println("This is a valid rectangle");
         System.out.println("The area is: "+ area(width,height));
         System.out.println("The perimeter is: "+ perimeter(width,height));

      }
      else
      {
         System.out.println("This is an invalid rectangle");
      }
      System.out.println("Do you want to enter another width and height (Y/N)? :");
      answer = in.nextLine();
      answer = in.nextLine();
      
     }
     while(answer.equals("Y"));
     System.out.println("Program Ends ");
   }
   public static boolean isValid(double width, double height)
   {
      if(width+ height >30)
      {
         return true;
      }
      else
      {
         return false;
      }
   }
   public static double area(double width, double height)
   {
      if(isValid(width,height))
      {
         return width*height;
      }
      else
      {
         return 0;
      }
   }
   public static double perimeter(double width, double height)
   {
      if(isValid(width,height))
      {
         return 2*(width+height);
      }
      else 
      {
      return 0;
      }
   }
   
}