package com.zyx.first.shape;


/**
 * Created by QDHL on 2017/12/7.
 */
public class Rectangle extends Shape {

    private double length;

    private double wide;

    public Rectangle(double length ,double wide){
        this.length = length;
        this.wide = wide;
        this.area = this.countArea();
    }

    @Override
    protected double countArea(){
        return this.length * this.wide;
    }

}
