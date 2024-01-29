import java.util.Scanner;
public class LabA11
{
   private static boolean checkString(String ch) {
		boolean val = false;
		if(ch.equalsIgnoreCase("YES")) {
			val = true;
		}
		return val;
	}
   public static void main(String []args)
   {     
      int answer;
      Scanner in = new Scanner(System.in);
      while(true)
      {
         System.out.println("0) Hellow World");
         System.out.println("1) Goodbye Moon");
         System.out.println("2) Walking on Sunshine");
         System.out.println("What would you like to do");
         answer = in.nextInt();
         
         if(answer == 0)
         {
            System.out.println("Hello!");
            System.out.println("Type YES to rerun.");
            
         }
         else if(answer == 1)
         {
            System.out.println("Ok, Bye.");
            System.out.println("Type YES to rerun.");
            
         }
         else if(answer == 2)
         {
            System.out.println("WHOA!");
            System.out.println("Type YES to rerun.");
            
         }
         else
         {
            System.out.println("");
         }
         
            System.out.println("Would you like to return");
            String ch = in.nextLine();
             ch = in.nextLine();
         if(checkString(ch) != true) {
					System.out.println("Exiting Program..!");
					break;
				}
         
      }
      
   }
  }