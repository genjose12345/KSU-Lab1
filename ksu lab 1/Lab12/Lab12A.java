import java.util.Scanner;
public class Lab12A
{
   public static void main(String args[])
   {
      Scanner in  = new Scanner(System.in);
      
      int legs;
      boolean roll;
      String parts = "";
      String rolling = "";
      System.out.println("You are about to create a chair");
      System.out.println("How many legs does your chair have");
      legs = in.nextInt();
      System.out.println("Is your Chair rolling (true/flase):");
      roll = in.nextBoolean();
      System.out.println("What is your chair made of:");
      parts = in.nextLine();       
      parts = in.nextLine(); 
      
      chair c1 = new chair(legs,roll,parts);
      if(roll == true)
      { 
          rolling = "rolling";
      }
      else
      {
          rolling = " not rolling";
      }
      System.out.println("your chair has "+c1.numOfLegs+" legs, is "+ rolling + " and is made of "+c1.material);
      System.out.println("");
   }

}
 class chair
   {
      public int numOfLegs;
      public boolean rolling;
      public String material;
      
      public int getnumOfLegs()
      {
         return numOfLegs;
      }
      public boolean getrolling()
      {
         return rolling;
      }
      public String getmaterial()
      {
         return material;
      }
      
      public void setnumOfLegs(int NumOfLegs)
      {
         this.numOfLegs = NumOfLegs;
      }
      public void setRolling(boolean Rolling)
      {
         this.rolling = Rolling;
      }
      public void setmaterial(String Material)
      {
         this.material = Material;
      }
      public chair(int numOfLegs,boolean rolling,String material) 
      {
         this.numOfLegs = numOfLegs;
         this.rolling = rolling;
         this.material = material;
      }
   }