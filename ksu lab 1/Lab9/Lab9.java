import java.util.Scanner;
public class Lab9
{
   public static void main(String []args)
   {
      int find= 0;
      int[] numbers = new int[10];
      Scanner in = new Scanner(System.in);  
      System.out.println("Please enter 10 numbers:");
       for(int i =0; i < 10;i++)
       {
          System.out.println("Integer"+(i+1)+":");
          numbers[i] = in.nextInt();         
       }
       System.out.println("what is the target numbner:");
       find = in.nextInt();
       
       for(int k = 0; k<10;k++)
       {
         if(find == numbers[k])
         {
            System.out.println("The target is  in the set.");
            break;
         }
         else if(k==9 && find !=numbers[k] )
         {
            System.out.println("The target is not in the set.");
            break;
         }
       }
   }
}