package com.zyx.first;

import com.zyx.first.recursion.Function;

public class RecursionMainTest {

    public static void main(String[] args) {
        //1.递归思想
        System.out.println("1.递归思想");
        //1.1 函数 f(x) = 2f(x - 1) + x^2 实现
        int x = 5;
        System.out.println( "如果x = " + x + "，则f(x) = 2f(x - 1) + x^2的结果为：" + Function.fun_1(x));
        //1.2 逐个打印数字
        x = 1549;
        System.out.print("打印的数字为：");
        Function.printOneInt(x);
        System.out.println("");
        //1.3 斐波那契数列之和递归实现
        x = 10;
        System.out.println("第" + x + "项斐波那契数列之和为：" + Function.fibonacciSequence(x));

    }
}
