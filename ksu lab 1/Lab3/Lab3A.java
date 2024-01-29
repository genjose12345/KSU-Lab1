import java.util.Scanner;
class Lab3A 
{
  public static void main(String[] args) 
  {
    double balance,apr,monthly,minimum,monthpercent;
    Scanner in = new Scanner(System.in);
    balance = in.nextDouble();
    apr = in.nextDouble();
    minimum = (balance * apr)/12 /100;
    monthly = apr / 12;
    
    System.out.print("Amount owed: ");
    System.out.print("$APR: ");
    System.out.printf("Monthly percentage rate: %.3f%n", monthly);
    System.out.printf("Minimum payment: $%.2f%n", minimum);
  }
}