import java.util.Scanner;
public class Lab7C
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in); 
        System.out.print("Please enter a value for the size: ");
        int size = in.nextInt();

        System.out.println("This is the requested " + size + "x" + size + " right-triangle:");
        for (int i = 0; i < size; i++) 
        { 
            for (int j = 1; j < size - i; j++) 
            {
                System.out.print(" ");
            }
            for(int z=0;z<=i;z++)
                {
             System.out.print("*");
                
                }
            
            System.out.println();
        }
    }
}