import java.util.Scanner;
public class Assignment3C
{
   public static void main(String [] args)
   {
      int channel,bpc;
      String format;
      Scanner in = new Scanner(System.in);
      System.out.println("How many channels does your image have?");
      channel = in.nextInt();
      if(channel == 1 || channel == 2)
      {
         System.out.println("It is GrayScale image.");
      }
      else if(channel == 3)
      {
         System.out.println("It is an RGB image.");

      }
      else if(channel == 4)
      {
         System.out.println("What is its BPC value?");
         bpc = in.nextInt();
         if(bpc == 32)
         {
            System.out.println("It is an RGB image");
         }
         else if(bpc == 16)
         {
           System.out.println("What image format is it?");
           in.nextLine();
           format = in.nextLine();
           
           if(format.equals("Tiff"))
           {
            System.out.println("It is a CMYK image.");
           }
           
           else if(format.equals("PNG"))
           {
            System.out.println("It is an RGB image.");
           }

         }
      }
      else if(channel == 5)
      {
         System.out.println("It is a CMYK image.");
      }
      else if(channel > 5)
      {
         System.out.println("This is invalid input. Please run the program again.");
      }
   }
}