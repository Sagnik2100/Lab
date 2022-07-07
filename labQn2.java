package day7;

public class labQn2 {
    public static void main(String[] args) {
        
    }
}
class Teacher{
    String designation;
    String college;
    void work(){
        System.out.println("Teacher is Working!");
    }
}
class itTeacher extends Teacher{
    String collegeName;
    String designation;
    void work(){
        System.out.println("IT-Teacher is Working!");
    }
}
class mathTeacher extends itTeacher{

}
class physicsTeacher extends itTeacher{

}
class musicTeacher extends itTeacher{
    
}