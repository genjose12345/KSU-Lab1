import java.util.Scanner;
public class Lab2A
{
   public static void main(String []args)
   {
      String name,name2,verb,adverb;
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a name: ");
      name = in.next();
      System.out.print("Enter another name: ");
      name2 = in.next();
      System.out.print("Enter a verb: ");
      verb = in.next();
      System.out.print("Enter an adverb:");
      adverb = in.next();
      System.out.print(" Once upon a time, there was a person named "+name+" who had a child named " +name2+". This child would "+verb+" "+ adverb+" while singing to strangers.");
   }
}