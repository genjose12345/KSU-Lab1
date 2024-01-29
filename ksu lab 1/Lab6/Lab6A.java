import java.util.Scanner;
public class Lab6A
{
   public static void main(String []args)
   {
      int big,random;
      big = 0;
      Scanner in  = new Scanner(System.in);
      for(int i = 1 ; i< 11; i++)
      {
         System.out.println("Please Enter number " +i+" :");
         random = in.nextInt();
         if(random > big)
         {
            big = random;
         }
         else
         {
            random = random;
         }
      }
      System.out.println("The largest number was "+ big);
   }
}