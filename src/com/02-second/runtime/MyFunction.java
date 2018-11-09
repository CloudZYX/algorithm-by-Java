﻿import java.util.function.Consumer;
import java.util.function.Function;

public class MyFunction{

    public static int seriseFunction(Function<Integer,Integer> f,int n){
        return f.accept(n);;
    }

    /**
     * 斐波那契数列（递归实现）
     * @param n
     */
    public static int fibonacciSequence(int n){
        if (n == 1){
            return 1;
        }if (n >= 2){
            //不符合递归的合成效益法则
            return fibonacciSequence(n - 1) + fibonacciSequence(n - 2);
        }
        return 0;
    }

}
