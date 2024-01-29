import java.util.Scanner;
import java.util.Arrays;
public class LabA8
{
   public static void main(String[]args)
   {
      Scanner in = new Scanner(System.in);
      int[] numbers =new int [5];
      int[] numbers2 = new int[5];
      int[] numbers3 = new int[5];
      for(int i = 0; i < numbers.length;i++)
      {  
         System.out.println("Please enter 5 integers for the first array:");
         numbers[i] = in.nextInt();
      }
      for(int k = 0; k < numbers2.length;k++)
      {
         System.out.println("Please enter 5 integers for the second array:");
         numbers2[k] = in.nextInt();
      }
      for(int j = 0 ; j<numbers3.length;j++)
      {
         numbers3[j] = numbers[j] + numbers2[j];
      }
      
      
      System.out.print("\nThe resulting sums are ");
        for (int i=0; i<5; i++){
            System.out.print(numbers3[i]);
            if (i<=4){
                System.out.print("|");
            }
        }
   }
      
      
}