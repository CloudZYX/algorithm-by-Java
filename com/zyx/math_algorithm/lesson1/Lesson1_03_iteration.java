package com.zyx.math_algorithm.lesson1;

import java.util.function.Function;

/**
 * @author zyx
 */
public class Lesson1_03_iteration {

    /**
     * 循环迭代（）
     * @param initParam     起始参数
     * @param times         循环次数
     * @param function      循环处理函数
     * @return
     */
    public static Long loopIteration(Long initParam, Integer times, Function<Long, Long> function){
        Long result = initParam,temp = initParam;
        for (int i = 1;i < times;i++){
            temp = function.apply(temp);
            result += temp;
        }
        return result;
    }
    /**
     * 循环迭代
     * @param initParam     起始参数
     * @param appFun        循环处理函数
     * @param continueFun   终止条件
     * @param maxTryTimes   最大计算次数
     * @return
     */
    public static Long loopIteration(Long initParam, Function<Long,Long> appFun, Function<Long, Boolean> continueFun,
                                     int maxTryTimes){
        Long result = initParam;
        int index = 0;
        while (continueFun.apply(result) && (index < maxTryTimes)){
            result = appFun.apply(result);
        }
        return result;
    }

    //todo 泛型计算
//    /**
//     * 循环迭代
//     * @param initParam     起始参数
//     * @param times         循环次数
//     * @param appFun        循环处理方法
//     * @param endFun        终止条件
//     * @return
//     */
//    public static <R extends Number> R loopIteration(R initParam, Integer times, Function<R,R> appFun,
//                                     Function<R, Boolean> endFun){
//        R result = initParam,temp = initParam;
//        for (int i = 1;i < times;i++){
//            temp = appFun.apply(temp);
//            result += temp;
//        }
//        return result;
//    }

    public static void main(String[] args) {
        System.out.println("---循环迭代---");
        System.out.println("赏麦数计算：" + loopIteration(1L, 63, f -> f * 2));
//        System.out.println("" + loopIteration(10, f ->));
    }
}
