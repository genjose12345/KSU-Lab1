import java.util.Scanner;
public class Assignment1C
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double subtotal,wholenumber;
        String animal;
        char letter;
        System.out.println("Enter your thrid favorite animal");
        animal = in.nextLine();
        System.out.println("Enter the subtotal from your last take-out meal");
        subtotal = in.nextDouble();
        System.out.println("Enter a whole number less than |32767|");
        wholenumber = in.nextDouble();
        System.out.println("Enter a single letter");
        letter = in.next(). charAt(0);
       System.out.println("your passphrase is: "+animal+" "+ wholenumber+ " "+wholenumber+" "+letter);
        System.out.println("Other variations are:");
        System.out.println( letter + " " +wholenumber+ " "+animal + " " +subtotal);
        System.out.println( subtotal+ " " +letter+" "+animal + " " +wholenumber);
        System.out.println(wholenumber + " "+animal + " " +letter+" " +subtotal);

    }
}