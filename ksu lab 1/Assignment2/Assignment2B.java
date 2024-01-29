import java.util.Scanner;
public class Assignment2B
{
   public static void main(String []args)
   {
      int second,seconds,hours,minutes;
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a number in seconds");
      second = in.nextInt();
      System.out.println("Time in seconds: " + second);
      System.out.println("Converting...");
      seconds = second % 60;
      
      minutes = (second % 3600) / 60;
      hours = second / 3600 ;
      
      System.out.println(second + " seconds == " + hours +"hour(s), " + minutes + "minute(s), and "+ seconds +"second(s)"); 
      
   }
}