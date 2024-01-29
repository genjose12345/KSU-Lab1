public class Lab13
{
   public static void main(String[]args)
   {
      BuildingBlueprint b1 = new BuildingBlueprint();
      BuildingBlueprint b2 = new BuildingBlueprint(30,30,.75F);
      System.out.println("Year 2020:");
      System.out.println("Building 1 has " + b1.getstories() + " floors, " + b1.getapartments() + " apartments, and is " + (b1.getoccupancy() * 100) + "% occupied. Full? " + b1.getisFull());
      System.out.println("Building 2 has " + b2.getstories() + " floors, " + b2.getapartments() + " apartments, and is " + (b2.getoccupancy() * 100) + "% occupied. Full? " + b2.getisFull());

        
      System.out.println();
      System.out.println("Many years pass.");
      System.out.println();
       
      b1.setoccupancy(0);
      b2.setoccupancy(1);

        
      System.out.println("Year 2020:");
      System.out.println("Building 1 has " + b1.getstories() + " floors, " + b1.getapartments() + " apartments, and is " + (b1.getoccupancy() * 100) + "% occupied. Full? " + b1.getisFull());
      System.out.println("Building 2 has " + b2.getstories() + " floors, " + b2.getapartments() + " apartments, and is " + (b2.getoccupancy() * 100) + "% occupied. Full? " + b2.getisFull());
      System.out.println("Looks like people prefer taller buildings");
      
      

      
   }
}
class BuildingBlueprint
{
      private int stories;
      private int apartments;
      private float occupancy;
      private boolean isFull;
      
      public int getstories()
      {
         return stories;
      }
      public int  getapartments()
      {
         return apartments;
      }
      public float getoccupancy()
      {
         return occupancy;
      }
      public boolean getisFull()
      {
         return isFull;
      }
      
      public void setstories(int Stories)
      {
        this.stories = Stories; 
      }
      public void setapartments(int Apartments)
      {
        this.apartments = Apartments; 
      }
      public void setoccupancy(float Occupancy)
      {
        this.occupancy = Occupancy; 
      }
      public void setisFull(boolean IsFull)
      {
        this.isFull = IsFull; 
      }
      
      public BuildingBlueprint()
      {
            stories = 10;
            apartments = 20;
            occupancy = 1;
            isFull = true;
      }
      public BuildingBlueprint(int stories, int apartments, float occupancy) 
      {
        this.stories = stories;
        this.apartments = apartments;
        this.occupancy = occupancy;
        this.isFull = occupancy == 1;
    }
}
