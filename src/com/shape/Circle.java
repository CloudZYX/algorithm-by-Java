package com.shape;

/**
 * Created by QDHL on 2017/12/6.
 */
public class Circle extends Shape {
    //半径
    private double radius;
    //圆周率
    private static double Pi = 3.1415926;

    public Circle(double radius){
        this.radius = radius;
        this.area = this.countArea();
    }

    @Override
    protected double countArea(){
        return this.radius * this.radius * Pi;
    }
}
