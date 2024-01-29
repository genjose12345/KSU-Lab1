import java.util.Scanner;
public class LabB11
{
   public static void main(String[]args)
   {
      String pass= "";
      
      boolean uppercase = false;
      boolean digit = false;
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a password:");
      pass = in.nextLine(); 
      boolean letters = pass.length()>=8;     
      for (int i = 0; i < pass.length(); i++) 
      {           
            char currentChar = pass.charAt(i);           
            if (Character.isUpperCase(currentChar))
            {
                uppercase = true;
            }          
            if (Character.isDigit(currentChar))
            {
                digit = true;
            }           
            if (uppercase && digit)
            {
                break;
            }
        }
             
     if(letters == true && uppercase == true && digit == true)
     {
      System.out.println("Valid password");
     }
     else
     {
      System.out.println("Invalid password");
     }
   }
}