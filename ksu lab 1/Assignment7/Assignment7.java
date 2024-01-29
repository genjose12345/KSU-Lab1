import java.util.Scanner;
public class Assignment7
{
   public static void main(String[]args)
   {
      Scanner in = new Scanner(System.in);  
      int choice  = 0;
      System.out.println("Enter inital width:");
      float initalwidth = in.nextFloat();
      System.out.println("Enter inital Height");
      float initalheight = in.nextFloat();
      System.out.println("Enter inital fill color");
      String initalfill = in.next();
      System.out.println("Enter inital Stroke color");
      String initalstroke = in.next();
      
       SVGRect r = new SVGRect(initalwidth, initalheight, initalfill, initalstroke);
      
      do
      {
         System.out.println("[SVG Class] Rectangle width: " + r.getwidth() +
        " Rectangle height: " + r.getheight() +
        " Fill color: " + r.getfill() +
        " Stroke color: " + r.getstrokecolor());

         choice = 0 ;
         System.out.println("What would you like to do?");
         System.out.println("1) Change the Rectangle size");
         System.out.println("2) Update the Fill and Stroke settings");
         System.out.println("3) Move the Rectangle");
         System.out.println("4) Print valid XML");
         System.out.println("5) Quit");
         choice = in.nextInt();
         
         if(choice ==1)
         {
            System.out.println("Enter a new width:");
            float newwidth = in.nextFloat();
            System.out.println("Enter a new height:");
            float newheight = in.nextFloat();
            
            if(r.setDimensions(newwidth, newheight))
            {
             System.out.println("Rectangle updated!");  
            }
            else
            {
               System.out.println("Invalid input – rectangle not changed.");
            }
            
         }
         
         
         else if(choice ==2)
         {
            System.out.println("Enter a new fill color:");
            String newfill = in.nextLine();
             newfill = in.nextLine();
            System.out.println("Enter a new stroke color:");
            String newstrokecolor = in.nextLine();
            System.out.println("Enter a new stroke width:");
            float newstrokewidth = in.nextFloat();
            if(r.setFillAndStroke(newfill, newstrokecolor, newstrokewidth))
            {
               System.out.println("Rectangle updated!");
            }
            else
            {
               System.out.println("Invalid input – fill and stroke settings not changed.");
            }
            
            
         }
         else if(choice ==3)
         {
            System.out.println("Enter a new offset x:");
            float newx = in.nextFloat();
            System.out.println("Enter a new offset y:");
            float newy = in.nextFloat();
            r.setOffsets(newx, newy);         
            System.out.println("Rectangle moved");             
         }
         else if(choice ==4)
         {
            r.printXML();
         }
         else
         {
            break;
         }
      }
      while(choice != 5);
   }
}
class SVGRect
{
   private float width;
   private float height;
   private String fill;
   private String strokecolor;
   private float strokewidth;
   private float x;
   private float y;
   
   SVGRect()
   {
      width = 1F;
      height = 1F;
      this.fill = "#0000FF";
      strokecolor= "#0F0F0F";
      strokewidth = 1.0F;
      x=0;
      y=0;
   }
   SVGRect(float w, float h, String fill, String stroke) 
   {
        width = w;
        height = h;
        this.fill = fill;
        strokecolor = stroke;
        strokewidth = 1.0f;
        x = 0;
        y = 0;
   }
   boolean setDimensions(float new_width, float new_height) 
   {
        if (new_width > 0 && new_height > 0) 
        {
            width = new_width;
            height = new_height;
            return true;
        } 
        else 
        {
            return false;
        }
    }
    
    void setOffsets(float new_offset_x, float new_offset_y)
    {
        x = new_offset_x;
        y = new_offset_y;
    }
    
    boolean setFillAndStroke(String new_fill, String new_stroke, float new_stroke_width) 
    {
        if (new_stroke_width > 0) 
        {
            fill = new_fill;
            strokecolor = new_stroke;
            strokewidth = new_stroke_width;
            return true;
        } 
        else 
        {
            return false;
        }
    }
    
    void printXML() 
    {
        System.out.println("[SVG Class] Rectangle width: " + width +" Rectangle height: " + height + " Fill color: " + fill + " Stroke color: " + strokecolor);
    }

    
    
   public void setwidth(float Width)
   {
      this.width = width;
   }   
   public void setheight(float height)
   {
      this.height = height;
   }
   public void setfill(String fill)
   {
      this.fill = fill;
   }
   public void setstrokecolor(String strokecolor)
   {
      this.strokecolor = strokecolor;
   }
   public void setstrokewidth(float strokewidth)
   {
      this.strokewidth = strokewidth;
   }
   public void setx(float x)
   {
      this.x = x;
   }
   public void sety(float y)
   {
      this.y = y;
   }   
   
   public float getwidth()
   {
      return width;
   }
   public float getheight()
   {
      return height;
   }
   public String getfill()
   {
      return fill;
   }
   public String getstrokecolor()
   {
      return strokecolor;
   }
   public float getstrokewidth()
   {
      return strokewidth;
   }
   public float getx()
   {
      return x;
   }
   public float gety()
   {
      return y;
   }
}