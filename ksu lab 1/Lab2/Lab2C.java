import java.util.Scanner;
public class Lab2C
{
   public static void main(String [] args)
   {
    double width,height;  
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a width:");
    width = in.nextDouble();
    System.out.print(" Enter a height:");
    height = in.nextDouble();
    double a = height * width;   
    System.out.println(String.format(" The area is %.0f",a));
    double p = 2*(height+width);
    System.out.print(String.format("The perimeter is %.0f",p));
   
   }
}