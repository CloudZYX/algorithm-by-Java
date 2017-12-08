package com.shape;

/**
 * Created by QDHL on 2017/12/6.
 */
public class Shape implements Comparable {
    //边长
    protected double sideLength;

    //面积
    protected double area;

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getSideLength() {
        return sideLength;
    }

    public double getArea() {
        return area;
    }

    public int compareTo(Shape shape) {
        if (this.area == shape.getArea()){
            return 0;
        }else if (this.area > shape.getArea()){
            return 1;
        }else {
            return -1;
        }
    }

    //求面积
    protected double countArea(){ return 0;}

    //找出图形数组中面积最大的图形
    public static Shape findMaxArea(Shape[] shapes){
        int maxIndex = 0;

        for (int i = 1;i < shapes.length;i++){
            if (shapes[i].compareTo(shapes[maxIndex]) > 0)
                maxIndex = i;
        }

        return shapes[maxIndex];
    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }


    public static void main(String[] args) {
        //找出图形数组中面积最大的图形
        Shape[] shapes = new Shape[2];
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(20,12);
        shapes[0] = circle;
        shapes[1] = rectangle;

        System.out.println("数组中最大面积为："+ Shape.findMaxArea(shapes).getArea());
    }
}
