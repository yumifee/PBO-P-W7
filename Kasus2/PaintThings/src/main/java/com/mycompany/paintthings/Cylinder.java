package com.mycompany.paintthings;

/**
 * @author Yumi Febriana
 */
public class Cylinder extends Shape{
    private double radius;
    private double height;
    
    public Cylinder(double radius , double height){
        super("Cynlinder");
        this.radius = radius;
        this.height = height;
    }
    
    public double area(){
        return Math.PI*radius*radius*height;
    }
    
    public String toString(){
        String result = super.toString() + " of radius : " + radius + "of height : " + height;
        return result;
    }
}
