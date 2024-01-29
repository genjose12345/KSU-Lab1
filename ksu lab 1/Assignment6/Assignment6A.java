import java.util.Scanner;
public class Assignment6A
{
   public static void main(String[]args)
   {
      Scanner in = new Scanner(System.in);
      int width,height;
      float starting;
      System.out.println("Enter the width");
      width = in.nextInt();
      System.out.println("Enter the height");
      height = in.nextInt();
      System.out.println("Enter the starting float");
      starting =in.nextFloat();
     
     float[][] array = new float[height][width];
        for (int i = 0; i < height; i++) 
        {
            for (int j = 0; j < width; j++) 
            {
                array[i][j] = starting;
            }
        }  
        for (int i = 0; i < height; i++) 
        {
            for (int j = 0; j < width; j++)
            {
                array[i][j] = (i % 2 == 0) ? 12.78f : 87.21f;
            }
        }

        
        print_array(array, width, height);

        while (true) {
            System.out.print("Enter a row index: ");
           int rowIndex = in.nextInt();
            System.out.print("Enter a column index: ");
           int colIndex = in.nextInt();
            System.out.print("Enter a length: ");
            int length = in.nextInt();
            System.out.print("Enter a value: ");
         float   value = in.nextFloat();

            if (updateRow(array, width, height, rowIndex, colIndex, length, value)) {
                break;
            } else {
                System.out.println("Invalid information! Try again.");
            }
        }
        print_array(array, width, height);
        System.out.println("[Finally done!]");
}
public static void print_array(float[][] array, int width, int height)
{
    for (int i = 0; i < height; i++) 
    {
            for (int j = 0; j < width; j++) 
            {
                System.out.print(array[i][j]);
                if (j < width - 1) 
                {
                    System.out.print(", ");
                }
            }
            System.out.println();
     }
}
 public static boolean updateRow(float[][] array, int width, int height, int rowIndex, int colIndex, int length, float value) 
 {
        if (rowIndex >= height || colIndex >= width || colIndex + length > width) 
        {
            return false;
        }
        for (int i = colIndex; i < colIndex + length; i++) 
        {
            array[rowIndex][i] = value;
        }
        return true;
}
}