package com.zyx.java_algorithm.first;

import com.zyx.java_algorithm.first.findmax.StringComparaUtil;
import com.zyx.java_algorithm.first.memory.MemoryCell;
import com.zyx.java_algorithm.first.shape.Circle;
import com.zyx.java_algorithm.first.shape.Rectangle;
import com.zyx.java_algorithm.first.shape.Shape;

import static com.zyx.java_algorithm.first.findmax.FindMaxUtil.findMax;

public class GenericityMainTest {
    public static void main(String[] args) {
        //2.泛型问题
        System.out.println("2.泛型问题");
        //2.1 简易内存的实现
        System.out.println("2.1 简单的泛型实现");
        MemoryCell memory = new MemoryCell();
        String s1 = "你好啊";
        memory.write(s1);
        String s2 = (String)memory.read(); //转换为正确的类型使用
        System.out.println("输入的字符串内容为：" + s2);

        //使用包装类实现基础类型的泛型
        int i1 = 15;
        memory.write(i1);   //自动装箱
        Integer i2 = (Integer)memory.read();
        System.out.println("输入的整数内容为：" + i2);
        System.out.println();

        //2.2 找寻泛型数列最大值
        System.out.println("2.2 找寻泛型数列最大值");
        Shape[] shapeArr = {new Circle(20),
                new Rectangle(4, 10)};
        int index = findMax(shapeArr);
        System.out.println("最大的图形为数列第" + (index + 1) + "项" +  " 最大的图形面积为：" + shapeArr[index].getArea());

        //使用函数对象实现
        System.out.println("2.3 使用函数对象");
        String[] nameArr = {"zyx","blm","xzg","zyxL"};
        System.out.println("最大的字符串是：" + nameArr[findMax(nameArr)]);

        StringComparaUtil cmp = new StringComparaUtil();
        System.out.println("最大的字符串是：" + nameArr[findMax(nameArr, cmp)]);

    }
}
