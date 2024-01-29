import java.util.Scanner;
public class Lab3C
{
   public static void main(String[]args)
   {
      int quarters,dimes,nickels,pennies,dollars,cents;
      Scanner in = new Scanner(System.in);
      System.out.print("Enter the number of quarters:");
      quarters = in.nextInt();
      System.out.print(" Enter the number of dimes:");
      dimes = in.nextInt();
      System.out.print(" Enter the number of nickels:");
      nickels = in.nextInt();
      System.out.println(" Enter the number of pennies:");
      pennies = in.nextInt();
      System.out.println("You entered "+quarters +" quarters. ");
      System.out.println("You entered "+dimes +" dimes. ");
      System.out.println("You entered "+nickels +" nickels. ");
      System.out.println("You entered "+pennies +" pennies. ");
      cents = (25 * quarters) + (10*dimes) + (5*nickels) + pennies;
      dollars = cents/ 100;
      cents %= 100;
      System.out.println("");
      System.out.printf("Your total is %d dollars and %d cents.",dollars,cents);
      
   }
}