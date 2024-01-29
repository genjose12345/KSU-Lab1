import java.util.Arrays;
import java.util.Scanner;
public class LabB8
{
   public static void main(String[]args)
   {
      Scanner in = new Scanner(System.in);
      int rows,columns,length;
      
      System.out.println("Please enter the number of rows:");
      rows = in.nextInt();      
      System.out.println("Please enter the number of columns:");
      columns = in.nextInt();
      
      int array[][] = new int[rows][columns];
        int x = 1;
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < columns; j++) 
            {
                array[i][j] = x++;
            }
        }
        
        System.out.printf("\nI have %d rows and %d columns. I need to fill-up %d spaces.\n", rows, columns, rows * columns);

        System.out.printf("\nThe %dx%d array:\n", rows, columns);

       
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < columns; j++) 
            {
                System.out.print(array[i][j] + " | ");
            }
            System.out.println();
        }
      
   }
}