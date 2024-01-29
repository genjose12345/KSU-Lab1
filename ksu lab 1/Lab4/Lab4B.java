import java.util.Scanner;
public class Lab4B
{
   public static void main(String []args)
   {
      String day;
      Scanner in = new Scanner(System.in);
      System.out.print("Enter the day:");
      day = in.nextLine();
      
      if(day.equals("monday") || day.equals("Monday"))
      {
         System.out.print("I have class today!");
      }
      else if(day.equals("tuesday") || day.equals("Tuesday"))
      {
         System.out.print("I should use this time to do my homework.");
      }
      else if(day.equals("wednesday") || day.equals("Wednesday"))
      {
         System.out.print("I have class today!");
      }
      else if(day.equals("thursday") || day.equals("Thursday"))
      {
         System.out.print("I have class today!");
      }
      else if(day.equals("friday") || day.equals("Friday"))
      {
         System.out.print("It’s Friday! Friday! Gotta get down on Friday!");
      }
   }
}