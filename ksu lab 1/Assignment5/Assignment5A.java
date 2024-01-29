import java.util.Scanner;
public class Assignment5A
{
   public static void main(String []args)
   {
      Scanner in = new Scanner(System.in);
      int choice,count,index;
      String name = "";
      String[] names = new String[10];
      count = 0;
      do
      {
         System.out.println("[Top 10 Friend's List]");
         System.out.println("What would you like do?");
         System.out.println("1) Enter a friend's name");
         System.out.println("2) Replace a friend's name");
         System.out.println("3) Display your mfirneds list");
         System.out.println("4) quit");
         choice = in.nextInt();
         if(choice ==1)
         {
            if(count < 10)  
            {  
               for(int i = 0; i < names.length;i++)
               {     
                  System.out.println("Enter a name");
                  name = in.nextLine();
                  name = in.nextLine();
                  names[i] = name;
                  break;
               }
            }
            else if(count == 10)
            {
               System.out.println("Sorry, your friends list is full!");
            }
         }
         else if(choice ==2)
         {
            System.out.println("Enter a name");
            name = in.nextLine();
            name = in.nextLine();
            System.out.println("Enter an index");
            index = in.nextInt();
            
            if(index < 0 || index > 10)
            {
               System.out.println("Sorry thats an invalid command!");  
            }
            else if(names[index - 1] != null) 
                    {
                        System.out.println(name + " has replaced " + names[index - 1] + " on your friends list!");
                        names[index - 1] = name;
                    }
            
         }
         else if(choice == 3)
         {
            System.out.println("friend's list");
            for(int i = 0; i < names.length;i++)
            {
               System.out.println((i + 1) + ")" + (names[i] != null ? names[i] : ""));
            }
         }
         else if(choice == 4)
         {
            break;
         } 
         
         
      }
      while(choice != 4);
      
   }
}