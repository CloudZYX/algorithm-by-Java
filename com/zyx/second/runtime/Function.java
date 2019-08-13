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
        int index = -1;
        int low = 0, high = array.length - 1;
        int mid = high / 2;

        while (low <= high){
            if (array[mid].compareTo(target) == 0){
                index = mid;
                break;
            }else if (array[mid].compareTo(target) < 0){
                //小于目标数
                low = mid + 1;
                mid = (low + high) / 2;
            }else if (array[mid].compareTo(target) > 0){
                //大于目标数
                high = mid -1;
                mid = (low + high) / 2;
            }
        }

        return index;
    }

    public static int maxCommonDivisor(int m, int n){
        if (n > m){
            System.out.println("");
            return -1;
        }
        int tem = -1;

        while (tem != 0){
            tem = m % n;
            if (tem == 0){
                break;
            }

            m = n;
            n = tem;
        }
        return n;
    }



    public static void main(String[] args) {
        System.out.println(fibonacciSequence(5));
        Serise serise = new Serise();

        System.out.println(useFunctionObject(serise,-5));
    }

}
