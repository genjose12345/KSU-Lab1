import java.util.Scanner;
public class Assignment4B
{
   public static void main(String[]args)
   {
      int fontsize,fontweight;
      String line = "";
      Scanner in = new Scanner(System.in);
      System.out.println("Font-size: ");
      fontsize = in.nextInt();
      System.out.println("Font-weight");
      fontweight = in.nextInt();
      int drawing= (fontsize * 2 + fontweight);
      int count = 0;
      int count2 = 0;    
     if (fontsize <3 &&  fontweight < 2)
     {
      for(int i = 0 ; i < drawing; i++)
      {          
         for(int k = 0; k < drawing; k++)
         {         
           if(i >= drawing / 2  && count2 < fontweight)
           {
            System.out.print("-");
           }
           else if(k >= drawing / 2  && count < fontweight)
           {            
            System.out.print("|");
               count ++;
           }
           else
           {
            System.out.print(" ");
           }           
           System.out.print("");         
        }
         count = 0;
         System.out.println("");
         if(i >= drawing / 2  && count2 < fontweight)
           {
            count2++;
           }
      }
     }
     else
     {
     for(int i = 0 ; i < drawing; i++)
      {          
         for(int k = 0; k < drawing; k++)
         {         
           if(i >= drawing / 2 -1  && count2 < fontweight)
           {
            System.out.print("-");
           }
           else if(k >= drawing / 2 -1 && count < fontweight)
           {            
            System.out.print("|");
               count ++;
           }
           else
           {
            System.out.print(" ");
           }           
           System.out.print("");         
        }
         count = 0;
         System.out.println("");
         if(i >= drawing / 2 -1 && count2 < fontweight)
           {
            count2++;
           }
      }
     }         
   }
}