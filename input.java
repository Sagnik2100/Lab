import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        String a;//initializing variable
        System.out.println("Enter a Number,Charecter or String ");//asking user for input
        Scanner sc= new Scanner(System.in);//creating an instance of the scanner class 
        a=sc.next();//initializing the input into the just declared variable
        System.out.println("The Input is "+a); //printing the variable
        sc.close();       
    }
}
