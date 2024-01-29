import java.util.Scanner;

public class Assignment6B 
{
    static String[] colorMap;
    static String[][] image;
    static int width;
    static int height;

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("[X PixMap Editor] Enter a hexadecimal color for color 1:");
        String color;
        String letter;
        colorMap = new String[4];
        for (int i = 0; i < 4; i++) 
        {
            color = in.nextLine();
            letter = in.nextLine();
            colorMap[i] = letter;
        }
        System.out.println("Enter a width:");
        width = in.nextInt();
        System.out.println("Enter a height:");
        height = in.nextInt();
        image = new String[height][width];
        for (int i = 0; i < height; i++) 
        {
            for (int j = 0; j < width; j++) 
            {
                image[i][j] = colorMap[0];
            }
        }
        int choice = 0;
        while (choice != 4) 
        {
            System.out.println("Options:");
            System.out.println("1) Set a color");
            System.out.println("2) Replace colors");
            System.out.println("3) Print X PixMap");
            System.out.println("4) Quit");
            System.out.print("Choice: ");
            choice = in.nextInt();

            switch (choice) 
            {
                case 1:
                    setColor();
                    break;
                case 2:
                    replaceColors();
                    break;
                case 3:
                    printXPixMap();
                    break;
                case 4:
                    System.out.println("[Closing...]");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        in.close();
    }
    public static void setColor() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a row index: ");
        int row = scanner.nextInt();
        System.out.print("Enter a column index: ");
        int col = scanner.nextInt();
        System.out.print("Enter a color: ");
        String newColor = scanner.next();

        if (checkIfValidColor(newColor)) 
        {
            image[row][col] = newColor;
            System.out.println("Color updated!");
        } 
        else 
        {
            System.out.println("Invalid color. Color not in the color map.");
        }
    }
    public static void replaceColors() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the color to replace: ");
        String oldColor = scanner.next();
        System.out.print("Enter the new color: ");
        String newColor = scanner.next();

        if (checkIfValidColor(oldColor) && checkIfValidColor(newColor)) 
        {
            for (int i = 0; i < height; i++) 
            {
                for (int j = 0; j < width; j++) 
                {
                    if (image[i][j].equals(oldColor)) 
                    {
                        image[i][j] = newColor;
                    }
                }
            }
            System.out.println("Color updated!");
        } 
        else 
        {
            System.out.println("Invalid color. Color not in the color map.");
        }
    }
    public static boolean checkIfValidColor(String color) 
    {
        for (String c : colorMap) 
        {
            if (c.equals(color)) 
            {
                return true;
            }
        }
        return false;
    }
    public static void printXPixMap() 
    {
        System.out.println("#define image_format 1");
        System.out.println("#define image_width " + width);
        System.out.println("#define image_height " + height);
        System.out.println("#define image_ncolors " + colorMap.length);
        System.out.println("#define image_chars_per_pixel 1");

        System.out.print("static char *image_colors[] = {");
        for (int i = 0; i < colorMap.length; i++) 
        {
            System.out.print("\"" + colorMap[i] + "\"");
            if (i < colorMap.length - 1) 
            {
                System.out.print(", ");
            }
        }
        System.out.println("};");

        System.out.print("static char *image_pixels[] = {");
        for (int i = 0; i < height; i++) 
        {
            System.out.print("\"");
            for (int j = 0; j < width; j++) 
            {
                System.out.print(image[i][j]);
            }
            System.out.print("\"");
            if (i < height - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("};");
    }
}