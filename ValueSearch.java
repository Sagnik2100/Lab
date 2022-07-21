//@author Sagnik Banerjee
package day12;
//program to search a given value in an array
public class ValueSearch{
    public static void main(String[] args) {
        Calculate c1= new Calculate();
		int[] arr={12,22,21,34,44};//declare the array
		boolean a=c1.calulation(arr,22);//run the function and store the return type
		System.out.println(a);
    }
}
class Calculate{ 
	boolean calulation(int[]arr,int n){
		for(int i=0;i<arr.length;i++){         //loop to iterate the array
			if(arr[i]==n){ //compare each element to the target value
				return true;
			}
		}
		return false;
	}
}