import java.util.Scanner;
public class Assignment4C
{
   public static  void main(String[]args)
   {
      Scanner in = new Scanner(System.in);
      int gallon3,gallon5,choice;
      gallon3 = 0;
      gallon5 = 0;
      System.out.println("[4 Gallons of water]");
      System.out.println("The 3 gallon can has 0 gallons of water. the 5 gallon can has 0 gallons of water");
      do
      {
      System.out.println("Options");
      System.out.println("1) Fill the 5 gallon can from the fountain");
      System.out.println("2) Fill the 3 gallon can from the fountain");
      System.out.println("3) Pour the 5 gallon can into the 3 gallon jug");
      System.out.println("4) Pour the 3 gallon can into the 5 gallon jug");
      System.out.println("5) Empty the 5 gallon can into the fountain");
      System.out.println("6) Empty the 3 gallon can into the fountain");
      System.out.println("What will you do?");
      choice = in.nextInt();
         if(choice == 1)
         {
            gallon5 = 5;
         }
         
         else if(choice == 2)
         {
            gallon3 = 3;
         }
         else if(choice == 3)
         {
            gallon3 = gallon3 + gallon5;
            gallon5 = 0;
            if(gallon3 > 3)
            {
             gallon3 = 3;  
            }
         }
         else if(choice == 4)
         {
            gallon5 = gallon5 + gallon3;
            gallon3 = 0;
            if(gallon5 > 5)
            {
               gallon5 = 5;
            }
         }
         else if(choice == 5)
         {
            gallon5 = 0;
         }
         else if(choice == 6)
         {
            gallon3 = 0;
         }
         else
         {
            
         }
         System.out.println("The 3 gallon can has "+gallon3+" the 5 gallon can has "+gallon5+" gallons of water." );
      }   
      
     while(gallon5 != 4);
      System.out.println("The 3 gallon can has "+gallon3+" the 5 gallon can has "+gallon5+" gallons of water." );
      System.out.println("You saved Bruce Willis and Samuel L. Jackson! You win!");
 
      
   }
}