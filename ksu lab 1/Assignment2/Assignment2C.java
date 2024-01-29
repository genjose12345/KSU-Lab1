import java.util.Scanner;
public class Assignment2C
{
   public static void main(String args[])
   {
      int x,y,width,height;
      
      Scanner in = new Scanner(System.in);
      System.out.println("enter an X coordinate");
      x = in.nextInt();
      System.out.println("enter an y coordinate");
      y = in.nextInt();
      System.out.println("enter an Width coordinate");
      width = in.nextInt();
      System.out.println("enter an Height coordinate");
      height = in.nextInt();
      System.out.println("[Sprite Hit Box Coordinates]");
      System.out.println("Bottom-Left: " + x+ ", " + y);
      System.out.println("Top-left: " + x+ ", " + (y + height));
      System.out.println("Bottom-Right: " + (x + width) + ", " + y);
      System.out.println("Top-Right: "+ (x+ width)+", " + (y + height) );
   }
}