import java.util.*;
public class Lab7A{
    public static void main(String args[]) {
      int n;
      Scanner in= new Scanner(System.in); 
      System.out.print("Please enter a value for the size: "); 
      n= in.nextInt(); 
      System.out.println("This is the requested "+n+"x"+n+" box:");
      
      for(int k=0;k<n;k++)
      {   
          for(int l=0;l<n;l++)
          {
              System.out.print("*"); 
          }
          System.out.println();
      }
    }
}