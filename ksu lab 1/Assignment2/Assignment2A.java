import java.util.Scanner;
public class Assignment2A
{
   public static void main(String [] args)
   {
      int side , radius;
      double perimeter,area,height,perimeter2,area2;
      Scanner in = new Scanner(System.in);
      System.out.println("[Octagon Calculator]");
      System.out.println("Enter the length of one side");
      side = in.nextInt();
      perimeter = 8 * side;
      System.out.println("Octagon permieter = " + String.format("%.0f",perimeter));
      area = 2 * (1 + Math.sqrt(2)) * (side * side);
      System.out.println("Octagon Area = " + String.format("%.4f",area));
      
      System.out.println("[Cylinder Calculator]");
      System.out.println("Enter the radius");
      radius = in.nextInt();
      System.out.println("Enter the height");
      height = in.nextDouble();
      perimeter2 = 2 * ((2 * radius) + height);
      System.out.println("Cylinder Perimeter = "+ perimeter2);
      area2 = (2 * 3.14 * radius * height) + (2 * 3.14 * (radius * radius));
      System.out.println("Cylinder Area = " + String.format("%.4f", area2));
      
   }
}