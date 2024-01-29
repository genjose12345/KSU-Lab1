import java.util.Scanner; 
public class Lab1B 
{ 
  
 public static void main (String[] args) 
 { 
 String message; 
 Scanner scan = new Scanner (System.in); 
 System.out.print ("Enter a line of text: "); 
 message = scan.nextLine(); 
 System.out.println ("You wrote '" + message +"'"); 
 } 
}