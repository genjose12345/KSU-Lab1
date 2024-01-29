import java.util.Arrays;
import java.util.Scanner;
public class LabC8
{
   public static void main(String[]args)
   {
      Scanner in = new Scanner(System.in);
      int rows,columns,length;
      
      int array_1D[]=new int[100];
		int k = 0;
      System.out.println("Please enter the number of rows:");
      rows = in.nextInt();      
      System.out.println("Please enter the number of columns:");
      columns = in.nextInt();
      int a=rows*columns;
      
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
        
        for(int i = 0; i<rows;i++)
        {
         for(int j =0;j<columns;j++)
         {
            k = i *columns+j;
            array_1D[k] = array[i][j];
            k++;
         }
        }
      System.out.printf("\n\nThe %d * %d 2-D array flattened into a %d cell 1-D array:\n",rows,columns,a);  
		for (int i = 0; i < rows; i++)
		{
			for (int j = 0; j < columns; j++)
         {
            System.out.print((array_1D[i * columns + j])+"|");
         }
				
      
      }
   }
}
