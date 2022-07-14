package com.innovation.shapes;
public class circle{
    private float radius;
    float pi;
    private circle(){
        radius=1.5f;
    }
    default circle(float radius){
        this();
        this.radius=radius;
    }
    circle(float radius,float pi){
        pi=3.5f;
        this.radius=radius;
    }
    float calculateCircleArea(float radius){
        float a= 3.14f*radius*radius;
        return a;
    }
    float calculateCircumference(float radius){
        float a= 2*3.14f*radius;
        return a;
    }
    public static void main(String[] args) {
        circle c2= new circle();
        c2.calculateCircleArea(123.22f);
        c2.calculateCircumference(156.55f);

    }
}
