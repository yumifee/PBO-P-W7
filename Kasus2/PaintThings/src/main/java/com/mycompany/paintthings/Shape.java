package com.mycompany.paintthings;

/**
 * @author Yumi Febriana
 */
abstract public class Shape {
    private String shapeName;
    public Shape (String shapeName){
        this.shapeName = shapeName;
    }
    public abstract double area();
    public String toString(){
        String result = "Shape Namae : " + this.shapeName;
        return result;
    }
}
