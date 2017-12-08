package com.recursion;

/**
 * Created by QDHL on 2017/12/6.
 */
public class Function {

    /**
     * 函数f(x) = 2f(x - 1) + x^2
     */
    public int fun1(int x){
        //基准情形
        if (x <= 0){
            return 0;
        }else {
            //不断推进
            return (2 * fun1(x - 1) + x*x);
        }
    }

    /**
     * 逐个打印整数
     */
    public void printOneInt(int n){
        if (n > 10){
            printOneInt( n / 10);
        }
        System.out.print(n % 10);
    }

    /**
     * 斐波那契数列（递归实现）
     * @param n
     */
    public void fibonacciSequence(int n){

    }

    public static void main(String[] args) {
        //函数f(x) = 2f(x - 1) + x^2的递归实现
        Function fun1 = new Function();
        System.out.println("f(x)= " + fun1.fun1(2));

        //逐个打印整数
        fun1.printOneInt(15);
    }
}
