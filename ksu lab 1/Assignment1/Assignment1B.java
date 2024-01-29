import java.util.Scanner;
public class Assignment1B
{
    public static void main(String[] args)
    {
        double price,localtax,service,subtotal,tip1,tip2,total1,total2,tax;
        Scanner in = new Scanner(System.in);
        System.out.println("enter the total price of the meal");
        price = in.nextDouble();
        System.out.println("Enter the local tax rate");
        localtax = in.nextDouble();
        System.out.println("enter the service charge");
        service = in.nextDouble();
        subtotal = price + service;
        System.out.println("the subtotal is "+subtotal);
        tip1 = .1 * subtotal;
        tax = localtax * subtotal;
        total1 = tax + subtotal + tip1;


        tip2 = .25 * subtotal;
        tax = localtax * subtotal;
        total2 = tax + subtotal + tip2;

        System.out.println("a 10% tip would be $" + tip1);
        System.out.println("The total would be "+ total1 );
        System.out.println("a 25% tip would be $" + tip2);
        System.out.println("The total would be "+ total2 );

    }
}