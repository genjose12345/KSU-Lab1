import java.util.Scanner;
public class Assignment3B
{
   public static void main(String []args)
   {
      int vist,vist2;
      String response;
      Scanner in = new Scanner(System.in);
      System.out.println("Have you been to Africa?");
      response = in.nextLine();
      
      if(response.equals("Y"))
      {
         vist = 1;
      }
      else
      {
         vist = 0;
      }
      
      System.out.println("Have you been to Anartica?"); 
      response = in.nextLine();
      if(response.equals("Y"))
      {
         vist = vist  + 1;
      }
      else
      {
         vist = vist;
      }

      
      System.out.println("Have you been to Asia?");
      response = in.nextLine();
      if(response.equals("Y"))
      {
         vist = vist + 1;
      }
      else
      {
         vist = vist;
      }

      
      System.out.println("Have you been to Austrilia?");
      response = in.nextLine(); 
      if(response.equals("Y"))
      {
         vist = vist + 1;
      }
      else
      {
         vist = vist;
      }

      
      System.out.println("Have you been to Europe?");
      response = in.nextLine(); 
      if(response.equals("Y"))
      {
         vist = vist + 1;
      }
      else
      {
         vist = vist;
      }

      
      System.out.println("Have you been to North America?");
      response = in.nextLine(); 
      if(response.equals("Y"))
      {
         vist = vist + 1;
      }
      else
      {
         vist = vist;
      }

      
      System.out.println("Have you been to South America?");
      response = in.nextLine(); 
      if(response.equals("Y"))
      {
         vist = vist + 1;
      }
      else
      {
         vist = vist;
      }

      
      switch(vist)
      {
         case 0:
            System.out.println("You have visited "+ vist + " continent: How is that possible? Are you living in space?");
            break;
         case 1:
            System.out.println("You have visited "+ vist +  " continent: That's a good start.Time to explore the world!");
            break;
         case 2:
            System.out.println("You have visited "+ vist +  " continents: You've just started your journey to see the world.");
            break;
         case 3:
            System.out.println("You have visited "+ vist +  " continents: You've just started your journey to see the world.");
            break;
         case 4:
            System.out.println("You have visited "+ vist +  " continents: You're an experienced travler now.");
            break;
         case 5:
            System.out.println("You have visited "+ vist +  " continents: You're an experienced travler now.");
            break;
         case 6:
            System.out.println("You have visited "+ vist +  " continents: Wow, you've been almost everywhere!");
            break;
         case 7:
            System.out.println("You have visited "+ vist +  " continents: You're a true world traveler!");
            break;
      } 
   }
}