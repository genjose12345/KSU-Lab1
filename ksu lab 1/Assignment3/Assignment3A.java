import java.util.Scanner;
public class Assignment3A
{
   public static void main(String []args)
   {
      String question1,question2,question3;
      Scanner in = new Scanner(System.in);
      System.out.println("What is your suspected illness?");
      question1 = in.nextLine();
      if(question1.equals("HGPS"))
      {
         System.out.println("do you have brittle bones?");
         question2 = in.nextLine();
         if(question2.equals("Y"))
         {
            System.out.println("It is possible that you have HGPS");
         }
         else
         {
            System.out.println("It is likely you do not have HGPS");
         }
      }
      else if(question1.equals("Lupus"))
      {
         System.out.println("It is not likely that you have Lupus");
      }
      else if(question1.equals("Bokter Syndrome"))
      {
         System.out.println("Do you have a Vitamin C deficiency?");
         question2 = in.nextLine();
         if(question2.equals("Y"))
         {
            System.out.println("Are you a sailor?");
            question3 = in.nextLine();
            if(question3.equals("N"))
            {
               System.out.println("It is not likely you have Boker Syndrome");
            }
            else
            {
               System.out.println("It is likely you have Boker Syndrome");
            }
         }
      }
      else
      {
         System.out.println("It is not likely you have Bokter Syndrome");
      }
      
   }
}