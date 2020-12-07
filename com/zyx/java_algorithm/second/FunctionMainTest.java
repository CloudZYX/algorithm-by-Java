package com.zyx.java_algorithm.second;

import com.zyx.java_algorithm.second.runtime.Function;
import com.zyx.java_algorithm.second.runtime.Serise;

public class FunctionMainTest {
    public static void main(String[] args) {
        //2.1 使用函数对象实现立方和
        System.out.println("2.1 级数的立方和");
        int n = 3;
        System.out.println("若n=" + n + " 则0到n∑ x^3 为：" + Function.useFunctionObject(new Serise(), n));
        System.out.println();

        //2.2 折半查找
        System.out.println("2.2 折半查找");
        Integer[] array = {-3,2,5,6,11,12,19};
        int index = Function.reduceHalfSelect(array, 5);
        if (index < 0){
            System.out.println("没有查询到该数");
        }else {
            System.out.println("第" + (index + 1) + "项，值为：" + array[index]);
        }
        System.out.println();

        //2.3 欧几里得公式(最大公约数)
        System.out.println("2.3 欧几里得公式");
        int m = 115, k = 65;
        System.out.println("m=" + m + "和k=" + k + "的最大公约数为：" + Function.maxCommonDivisor(m,k));


    }
}
