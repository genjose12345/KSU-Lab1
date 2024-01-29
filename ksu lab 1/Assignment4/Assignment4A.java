import java.util.Scanner;
public class Assignment4A
{
   public static void main(String[]args)
   {
      int mph,slowing,seconds,seconds2,count;
      double distance;
      Scanner in = new Scanner(System.in);
      System.out.println("How fast are you going (miles/hour)?");
      mph = in .nextInt();
      
      System.out.println("How quickly can you decelerate (miles)?");
      slowing = in.nextInt();
      
      System.out.println("How often do you want to see updates (in seconds)? ");
      seconds = in.nextInt();
      
      System.out.println("You are going " + mph +" MPH when you slam on the brakes!");
      distance  = 0;
      seconds2= seconds;
      count = 0;
      for(int i = mph; i > 0; i -= slowing)
      {
         count++;
         distance += i * 1.466667;
         if(count == seconds)
         {
            System.out.println("At " + seconds2 + ", second you have traveled "+ distance + " feet and are now moving at "+ (i - 1) +" MPH." );
            seconds2  += seconds;
            count = 0;
         }         
      }
      seconds2 -= 1;
      System.out.println("you took " + seconds2 + " seconds to stop and traveled " + distance + " during that time!");
   }
}