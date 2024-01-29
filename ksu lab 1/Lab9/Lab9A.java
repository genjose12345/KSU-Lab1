import java.util.Scanner;

public class Lab9A 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        
        int[] numbers = new int[10];
        
        
        System.out.println("Please enter 10 numbers:");
        for (int i = 0; i < 10; i++) 
        {
            System.out.print("Integer " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        
        System.out.print("What is the target number: ");
        int target = scanner.nextInt();
        
       
        boolean found = false;
        for (int i = 0; i < 10; i++) 
        {
            if (numbers[i] == target) 
            {
                found = true;
                break;
            }
        }
        
        
        if (found) 
        {
            System.out.println("The target is in the set.");
        } 
        else 
        {
            System.out.println("The target is not in the set.");
        }
        
        scanner.close();
    }
}