import java.util.Scanner;
public class Assignment7B
{
   public static void main(String[]args)
   {  
      Scanner in = new Scanner(System.in);
      System.out.println("[3D Collision Tester]");
      System.out.println("Create Player 1");
      System.out.println("Enter X position:");
      int x = in.nextInt();
      System.out.println("Enter Y position:");
      int y = in.nextInt();
      System.out.println("Enter Z position:");
      int z = in.nextInt();
      System.out.println("Enter Player Hitbox Width:");
      int width = in.nextInt();
      System.out.println("Enter Player Hitbox Height:");
      int height = in.nextInt();
      System.out.println("Enter Player Hitbox Depth:");
      int depth = in.nextInt();
      player p1 = new player(width,height,depth,x,y,z);
      
      System.out.println("Create Player 1");
      System.out.println("Enter X position:");
      x = in.nextInt();
      System.out.println("Enter Y position:");
      y = in.nextInt();
      System.out.println("Enter Z position:");
      z = in.nextInt();
      System.out.println("Enter Player Hitbox Width:");
      width = in.nextInt();
      System.out.println("Enter Player Hitbox Height:");
      height = in.nextInt();
      System.out.println("Enter Player Hitbox Depth:");
      depth = in.nextInt();
      player p2 = new player(width,height,depth,x,y,z);
      boolean quit = false;
      
      do
      {
         
         p1.displayInfo("Player 1");
         p2.displayInfo("Player 2");
         System.out.println("Which one do you want to move?");
         int choice = in.nextInt();
         if(choice == 1)
         {
            System.out.println("Which direction should Player 1 move (up, down, left, right, forward, or backword)?");
            String move = in.next();
            if(move.equals("Up")||move.equals("up"))
            {
               System.out.println("How far should Player 1 move?");
               int distance = in.nextInt();
               p1.movey(distance);
            }
            else if(move.equals("Down")||move.equals("down"))
            {
               System.out.println("How far should Player 1 move?");
               int distance = in.nextInt();
               p1.movey(-distance);
            }
            else if(move.equals("Left")||move.equals("left"))
            {
               System.out.println("How far should Player 1 move?");
               int distance = in.nextInt();
               p1.movex(-distance);
            }
            else if(move.equals("Right")||move.equals("right"))
            {
               System.out.println("How far should Player 1 move?");
               int distance = in.nextInt();
               p1.movex(distance);
            }
            else if(move.equals("Forward")||move.equals("forward"))
            {
               System.out.println("How far should Player 1 move?");
               int distance = in.nextInt();
               p1.movez(distance);
            }
            else if(move.equals("Backward")||move.equals("backward"))
            {
               System.out.println("How far should Player 1 move?");
               int distance = in.nextInt();
               p1.movez(-distance);
            }
         }
         else if(choice == 2)
         {
            System.out.println("Which direction should Player 2 move (up, down, left, right, forward, or backword)?");
            String move = in.next();
            if(move.equals("Up")||move.equals("up"))
            {
               System.out.println("How far should Player 1 move?");
               int distance = in.nextInt();
               p2.movey(distance);
            }
            else if(move.equals("Down")||move.equals("down"))
            {
               System.out.println("How far should Player 2 move?");
               int distance = in.nextInt();
               p2.movey(-distance);
            }
            else if(move.equals("Left")||move.equals("left"))
            {
               System.out.println("How far should Player 2 move?");
               int distance = in.nextInt();
               p2.movex(-distance);
            }
            else if(move.equals("Right")||move.equals("right"))
            {
               System.out.println("How far should Player 2 move?");
               int distance = in.nextInt();
               p2.movex(distance);
            }
            else if(move.equals("Forward")||move.equals("forward"))
            {
               System.out.println("How far should Player 2 move?");
               int distance = in.nextInt();
               p2.movez(distance);
            }
            else if(move.equals("Backward")||move.equals("backward"))
            {
               System.out.println("How far should Player 2 move?");
               int distance = in.nextInt();
               p2.movez(-distance);
            }

         }
          if (p1.DidTheyCollide(p2)) 
          {
                System.out.println("They collided!");  
                quit = true;          
                break;
           }
      }
      while(quit != true);
   }
}
class player
{  
   
   private int width;
   private int height;
   private int x;
   private int y;
   private int z;
   private int depth;
   public player(int width, int height, int depth, int x, int y, int z)
   {
      this.width =width;
      this.height = height;
      this.x = x;
      this.y = y;
      this.z = z;
   }
   public void movex(int xmoves)
   {
      x += xmoves;
   }
   public void movey(int ymoves)
   {
    y += ymoves;  
   }
   public void movez(int zmoves)
   {
      z += zmoves;
   }
         public boolean DidTheyCollide(player p)
      {
        if((this.x < p.getwidth() + p.getx()) && (this.width + this.x > p.getx()) && (this.y < p.getheight() + p.gety()) && (this.height + this.y > p.gety())) 
        {
            System.out.println("They Collided!");
            return true;
        }
        return false;
      }
   public void setwidth(int Width)
   {
      this.width =Width ;
   }
    public void setheight( int height)
   {
      this.height = height;
   }
   public void setdepth(int Depth)
   {
      this.depth = Depth;
   }
    public void setx(int X)
   {
      this.x = X ;
   }
    public void sety(int Y)
   {
      this.y = Y ;
   }
    public void setz(int Z)
   {
      this.z = Z;
   }
   
   public int getwidth()
   {
      return width;
   }
   public int getheight()
   {
      return height;
   }
   public int getdepth()
   {
      return depth;
   }
   public int getx()
   {
      return x;
   }
   public int gety()
   {
      return y;
   }
   public int getz()
   {
      return z;
   }
   public void displayInfo(String playerName) 
   {
        System.out.println(playerName + " is at (" + x + ", " + y + ", " + z + ")");
    }  
}