import java.util.*;
import java.lang.*;
import java.io.*;

public class Lab7B
{
	public static void main(String[] args) {
	    
	    System.out.print("Please enter a value for the size: ");
		Scanner in =new Scanner(System.in);
		int size =in.nextInt();
		
		
		System.out.println("This is the requested "+size+"x"+size+" right-triangle");
		
		for(int i=0; i<size; i++){

		    for(int j=0;j<=i;j++){
		        System.out.print("*");
		    }
		    
		    System.out.println();
		}
	}
}