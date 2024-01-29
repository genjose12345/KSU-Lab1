import java.util.Scanner;
public class Assignment1A
{
    public static void  (String[] args)
    {
        Scanner in = new Scanner(System.in);
        int red,green,blue;
        double red2,green2,blue2;
        double percentage;
        System.out.println("Enter a red value from (0-255)");
        red = in.nextInt();
        System.out.println("Enter a green value from (0-255)");
        green = in.nextInt();
        System.out.println("Enter a blue value from (0-255)");
        blue = in.nextInt();
       /* System.out.println(red);
        System.out.println(green);
        System.out.println(blue);
        */
        System.out.println("Enter a percentage to brighten color from 0.0-1.0");
        percentage = in.nextDouble();
        System.out.println(percentage);
        red2 = red * percentage + red;
        green2 = green * percentage + green;
        blue2 = blue * percentage + blue;
        System.out.println("A " + percentage + " brighter tint of RGB " + "("+red+","+green+","+blue+")"+
                " is RGB "+"("+red2+","+ green2 +","+blue2+")");
    }
}