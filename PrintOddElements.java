//@author Sagnik Banerjee
package day12;
//program to print odd placed elements in an array
public class PrintOddElements {
    public static void main(String[] args) {
        int[]arr={12,22,55,48,486,22,47,54,464};
        Calculate c1= new Calculate();
        c1.calculation(arr);
    }
}
class Calculate{
    void calculation(int[]arr){
        for(int i=0;i<arr.length;i+1){//loop to print  the elements which are oddly placed
            System.out.println(arr[i]);
        }
    }
}