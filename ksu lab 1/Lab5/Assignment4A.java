import java.util.Scanner;
public class Assignment4A
{
   public static void main(String[]args)
   {
      int mph,slowing,seconds,time,accelerate2,seconds2;
      double distance,travel2,feet;
      Scanner in = new Scanner(System.in);
      System.out.println("How fast are you going (miles/hour)?");
      mph = in .nextInt();
      
      System.out.println("How quickly can you decelerate (miles)?");
      slowing = in.nextInt();
      
      System.out.println("How often do you want to see updates (in seconds)? ");
      seconds = in.nextInt();
      
      System.out.println("You are going " + mph +" MPH when you slam on the brakes!");
      distance = mph * 1.466667;
      accelerate2 =  mph - seconds * slowing;
      seconds2 = seconds;
      
      do
      {
  
         System.out.println("At " + seconds2 + ", second you have traveled "+ distance + " feet and are now moving at "+ accelerate2 +" MPH." );
         seconds2  += seconds;
         accelerate2 = mph - (seconds2 * slowing);
         distance = distance + ((accelerate2 + 1) * 1.466667);
      }
      while(accelerate2 >= 0);
      seconds2  -=1;
      System.out.println("you took " + seconds2 + " seconds to stop and traveled " + distance + " during that time!");
      
   }
}