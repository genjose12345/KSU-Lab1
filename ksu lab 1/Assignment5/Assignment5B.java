import java.util.Scanner;
public class  Assignment5B
{
   public static void main(String[]args)
   {
      System.out.println("[Maze Game]");
      Scanner in = new Scanner(System.in);
      String move = "";
      String[][] maze = 
        {
            {"_","N","_","N","N"},
            {"_","N","_","N","_"},
            {"_","_","_","N","_"},
            {"N","N","_","_","W"},
            {"_","_","_","N","N"}

        };
        int win = 0;
        int playerRow = 4;
        int playerCol = 0;
        int winrow = 3;
        int wincol = 4; 
        int lose = 0;
        do
        {
         printMaze(maze, playerRow, playerCol);
         System.out.println("Which direction do you want to move?");
         move = in.nextLine(); 
         
       try
       {
         if(move.equals("up"))
         {
               if(maze[playerRow - 1][playerCol].equals("N")) 
               {
                 System.out.println("You hit a wall  Game Over!");
                 lose = 1;             
               }
               else
               {
                  playerRow = playerRow -1;
               }
                                               
         }
         else if(move.equals("down"))
         {
            if(maze[playerRow + 1][playerCol].equals("N")) 
               {
                  System.out.println("You hit a wall  Game Over!");
                  lose = 1;                 
               }
               else
               {
                  playerRow = playerRow +1;
               }
         }
         else if(move.equals("left"))
         {
            if(maze[playerRow][playerCol - 1].equals("N")) 
               {
                  System.out.println("You hit a wall  Game Over!");
                  lose = 1;                 
               }
               else
               {
                  playerCol = playerCol - 1;
               }
         }
         else if(move.equals("right"))
         {
          if(maze[playerRow][playerCol + 1].equals("N")) 
               {
                  System.out.println("You hit a wall  Game Over!");
                  lose = 1;                 
               }
               else
               {
                  playerCol = playerCol +1;
               }
         }
         else
         {
            System.out.println("Thats not a valid direction!");
         }
         
      }
      catch(Exception e)
            {
               System.out.println("You can’t move there it’s out of bounds!");
            }
      if(playerRow == winrow && playerCol == wincol)
      {
         win = 1;
      }
      }
        while(win == 0 && lose == 0);
        if(lose == 0)
        {
         System.out.println("You win");
        }       
   }
   private static void printMaze(String[][] maze, int playerRow, int playerCol) 
    {
        for (int i = 0; i < maze.length; i++) 
        {
            for (int j = 0; j < maze[i].length; j++) 
            {
                if (i == playerRow && j == playerCol) 
                {
                    System.out.print("P");
                } 
                else 
                {
                    System.out.print(maze[i][j]);
                }
            }
            System.out.println();
        }
    }
}