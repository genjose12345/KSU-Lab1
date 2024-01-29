import java.util.Random;
import java.util.Scanner; 
public class Lab6B
{
   public static void main(String args[])
   {
      Random rand = new Random(); 
      int n = rand.nextInt(1001);
      Scanner in = new Scanner(System.in);      
      int trys = 0;
      System.out.println("Enter a number between 1 and 1000:");
      int number = in.nextInt();
      while(number != n)
      {
         rand = new Random(); 
         n = rand.nextInt(1001);
         trys = 1+ trys;
         System.out.println("My guess was " + n);
      }
      System.out.println("I guessed the number was "+ n + " and it only took me " + trys +" guesses");
   } 
}