//@author Sagnik Banerjee
package day19;

import java.util.*;

public class ArrayListComparison {
    public static void main(String[] args) {
        ArrayList<Integer> ar1=new ArrayList<>();//instantiation of 1st arrayList and assignment of values
        ar1.add(1);
        ar1.add(2);
        ar1.add(3);
        ar1.add(4);
        ar1.add(5);
        ar1.add(6);
        ar1.add(7);
        ArrayList<Integer>ar2= new ArrayList<>();//instantiation of 2nd arrayList and assignment of values
        ar2.add(0);
        ar2.add(1);
        ar2.add(2);
        ar2.add(3);
        ar2.add(4);
        ar2.add(5);
        ar2.add(6);
        boolean a= ar1.equals(ar2);
        System.out.println("Does the 1st  List equals the 2nd?:True or False  :"+a);//checking for equality 
    }
 

}
