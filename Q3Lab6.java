package day15;
//author Sagnik Banerjee
public class Q3Lab6 {
    
        String str = "C:\\IBM\\DB2\\PROGRAM\\DB2COPY1.EXE"; 			// using double back slaces for escape sequence
		String newStr = str.replace('\\', ' ');						    // replacing "\" with whitespaces because, we can't use \ with split
		
		String[] arr = newStr.split(" "); 								// spliting all elements and storing into array
		int length = arr.length;
		
		System.out.println("Drive: " +arr[0]+ "\\");					// printing first element in 'Drive:'
		
		// printing middle elements using loop
		System.out.print("Folders: ");
		for(int i=1; i<length-1;i++) {
			System.out.print(arr[i]+" || ");							
		}
		System.out.println("\nFile: "+arr[length-1]);					// lenght-1, because I want to print last element of array
}
