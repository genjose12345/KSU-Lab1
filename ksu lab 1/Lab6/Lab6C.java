import java.util.Scanner;
public class Lab6C
{
   public static void main(String[]args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Welcome!");
      System.out.println("You have $1000 in your account");
      double balance  = 1000;
      String continues;
      do
      {
        System.out.println("Menu");
        System.out.println("0 - Make a deposit");
        System.out.println("1 - Make a withdrawa");
        System.out.println("2 - Display account value");
        System.out.println("");
        System.out.println("Please make a selection");
        int choice = in.nextInt();
        
        
        switch (choice) {
                case 0:
                    System.out.print("How much would you like to deposit? $");
                    double depositAmount = in.nextDouble();
                    balance += depositAmount;
                    break;

                case 1:
                    System.out.print("How much would you like to withdraw? $");
                    double withdrawAmount = in.nextDouble();
                    if (withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                    } else {
                        System.out.println("Insufficient funds.");
                    }
                    break;

                case 2:
                    System.out.println("Your current balance is $" + balance);
                    break;

                default:
                    System.out.println("Invalid selection.");
                    break;
            }
            System.out.println("Would you like to return to the main menu (Y/N)? :");
            continues = in.nextLine();
            
      }
      while  (continues.equals("Y") || continues.equals("y"));
      System.out.println("Thank you for using our bank services!");
   }
}