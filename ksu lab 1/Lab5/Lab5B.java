import java.util.Scanner;
public class Lab5B
{
    public static void main(String []args)
    {
        
        int input, answer; 
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer:");
        input = in.nextInt();
        
        switch( input % 2)
        {
         case 0:
         System.out.println("This number is divisible by 2");
         break;
         
         default:
            switch(input % 3)
            {
               case 0:
               System.out.println("This number is divisible by 3");
               break;
               
               default:
               switch(input % 5)
            {
               case 0:
               System.out.println("This number is divisible by 5");
               break;
               
               default:
               System.out.println("This number is undetermined");
            }
            }
                  
        }
    }
}