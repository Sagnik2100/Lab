
//Author Sagnik Banerjee
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
	
	public static void main(String[] args){	//main method
		
		while(true) {	//using loop for consecutive operations; not mandatory
		
		//Logic
		try {
			Scanner s = new Scanner(System.in);									//creating scanner object 
			
				
				System.out.print("First input: ");
				int x = s.nextInt();											        //taking user input
				System.out.print("Second input: ");
				int y = s.nextInt();											        //taking user input
				
				//Output
				System.out.println("Output: "+ (x/y) +"\n");			//here exception can occur.
			
		}
		catch(ArithmeticException e1){											      //handling exception
			System.out.println(e1 +"\n");
		}
		catch(InputMismatchException e2){										      //handling exception
			System.out.println(e2 +"\n");
		}
	}
	
	  }
}