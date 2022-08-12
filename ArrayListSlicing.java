package day19;

public class ArrayListSlicing {//Program to Extract a portion of an arrayList. 
    public static void main(String[] args) {
        ArrayList<String>ar1= new ArrayList<>();//Instantiation of ArrayList
        ar1.add("Red");   //Adding elements into the ArrayList
        ar1.add("Green");
        ar1.add("Orange");
        ar1.add("White");
        ar1.add("Black");
        System.out.println("The arrayList is "+ar1);//The Full ArrayList
        System.out.println("The Sub-ArrayList is "+ar1.subList(0, 3));
    
        
        }
}
