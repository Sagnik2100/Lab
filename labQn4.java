package day7;

public class labQn4 {
    public static void main(String[] args) {
        
    }
}
class Bank{
    float getRateOfInterest(){
        return 12.33f;
    }
}
class SBI extends Bank{
    float getRateOfInterest(){
        return 8.00f;
    }
}
class ICICI extends Bank{
    float getRateOfInterest(){
        return 7.00f;
    }
}
class axis extends Bank{
    float getRateOfInterest(){
        return 9.00f;
    }
}