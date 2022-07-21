//@author Sagnik Banerjee
package day12;

import java.util.Arrays;

//program to find if an array contains a duplicate value
public class FindDuplicate {
    public static void main(String[] args) {
        Calculate c1= new Calculate();
        int[]arr={1,5,5,48,46,55,55,1};
        boolean a=c1.calculation(arr);
        System.out.println("The array contains duplicate value if the text is true and vise versa: "+a);
    }
}
class Calculate{
    boolean calculation(int[]arr){
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==arr[i+1]){
                return true;
            }
        }
        return false;
    }
}
