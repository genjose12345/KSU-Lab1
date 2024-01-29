import java.util.Scanner;
public class Lab4C
{
   public static void main(String[]args)
   {
      Scanner in = new Scanner(System.in);
      double number,number2;
      int response;
      System.out.println("Welcome!");
      System.out.println("Please input a number:");
      number = in.nextDouble();
      System.out.println("What would you like to do to this number:");
      System.out.println("0)Get the additive inverse of the number");
      System.out.println("1)Get the reciprocal of the number");
      System.out.println("2)Square the number");
      System.out.println("3)Cube the number");
      System.out.println("4)Exit the program");
      response = in.nextInt();
      
      switch(response)
      {
      case 0:
         number2 = number * -1;
         System.out.print("The additive inverse of "+ number + " is " + number2);
         break;
      case 1:
         number2 = 1/number;
         System.out.print("The reciprocal of " + number + " is " + number2);
         break;
      case 2:
         number2 = number * number;
         System.out.print("The square of " + number + " is " + number2);
         break;
      case 3:
         number2 =number * number * number;
         System.out.print("The cube of " + " is " + number2);
         break;  
      case 4:
         System.out.print("Thank you, goodbye!");
         break;
      default:
		   System.out.println("Invalid input, please try again!");
		   break;
      }        
   }
}