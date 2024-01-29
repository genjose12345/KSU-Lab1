import java.util.Scanner;
public class Lab12B
{
   public static void main(String args[])
   {
      Scanner in = new Scanner(System.in);
      int old;
      double size,eats;
      String names,type,colors;
      
      System.out.println("You are about to create a dog.");
      System.out.println("How old is the dog:");
      old = in.nextInt();
      System.out.println("How much does the dog weigh");
      size = in.nextDouble();
      System.out.println("What is the dog's name");
      names = in.nextLine();
      names = in.nextLine();
      System.out.println("What color is the dog:");
      colors = in.nextLine();
      System.out.println("What breed is the dog:");
      type = in.nextLine();
      Dog b1 = new Dog();
      
      System.out.println(names + " is a "+old+" year old "+colors+" "+type+" that weighs "+size+" lbs");
      b1.Bark();
      System.out.println(names+" is hungry, how much should he eat: ");
      eats = size + in.nextDouble();
      System.out.println(names+ " isn’t a very good name. What should they be renamed to:");
      String newnames = in.nextLine();
       newnames = in.nextLine();
      System.out.println(newnames+" is a "+old+" year old "+colors+" "+type+" that weighs "+eats+" lbs" );
   }
}
class Dog
{
   int age;
   double weight;
   String name;
   String furColor;
   String breed;
   
   public void Bark()
   {
       System.out.println("Woof! Woof!");
   }
   public void rename(String name)
   {
      
      this.name = name;       
   }
   public void  eat(double eat)
   {
      weight += eat;
   }
   public int getage()
   {
      return age;
   }
   public double getweight()
   {
      return weight;
   }
   public String  getfurColor()
   {
      return furColor;
   }
   public String getname()
   {
     return name ;
   }
   public String getbreed()
   {
      return breed;      
   }
   public void setage(int Age)
   {
      this.age = Age;
   }
   public void setweight(double Weight)
   {
      this.weight = Weight;
   }
   public void setname(String Name)
   {
      this.name = Name;   
   }
   public void setfurColor(String FurColor)
   {
      this.furColor = FurColor;
   }
   public void setbreed(String Breed)
   {
      this.breed = Breed;   
   }
      
}