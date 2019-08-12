package com.zyx.second.runtime;

import java.util.List;
import java.util.function.Consumer;
import com.zyx.second.runtime.Serise;

public class Function {

    /**
     * 函数对象使用
     * @param f
     * @param n
     * @return
     */
    public static int useFunctionObject(java.util.function.Function<Integer,Integer> f, int n){
        return f.apply(n);
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

    /**
     * 折半查找
     * @param array
     * @param target
     * @param <T>
     * @return
     */
    public static <T extends Comparable> int reduceHalfSelect(T[] array, T target){
        int index = 0;
        int mid = array.length / 2;

        if (array[mid].compareTo(target) == 0){
            index = mid;
        }else if (array[mid].compareTo(target) > 0){

        }else if (array[mid].compareTo(target) < 0){

        }


        return index;
    }



    public static void main(String[] args) {
        System.out.println(fibonacciSequence(5));
        Serise serise = new Serise();

        System.out.println(useFunctionObject(serise,-5));
    }

}
